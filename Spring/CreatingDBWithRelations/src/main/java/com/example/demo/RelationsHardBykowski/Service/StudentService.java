package com.example.demo.RelationsHardBykowski.Service;

import com.example.demo.RelationsHardBykowski.Repository.*;
import com.example.demo.RelationsHardBykowski.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    BackpackRepo backpackRepo;

    @Autowired
    NotepadRepo notepadRepo;

    @Autowired
    ProfessorRepo professorRepo;

    @Autowired
    RoomRepo roomRepo;

    @EventListener(ApplicationReadyEvent.class)
    public void run(){
        //backpacks =============================================================================
        Backpack nike = new Backpack("Nike");
        Backpack adidas = new Backpack("Adidas");

        backpackRepo.save(nike);
        backpackRepo.save(adidas);
        //notepads =============================================================================
        Notepad n1 = new Notepad("Analiza");
        Notepad n2 = new Notepad("Algebra");
        Notepad n3 = new Notepad("Fizyka");
        Notepad n4 = new Notepad("Logika");

        n1.setBackpack(nike);
        n2.setBackpack(nike);
        n3.setBackpack(adidas);
        n4.setBackpack(adidas);
        notepadRepo.save(n1);
        notepadRepo.save(n2);
        notepadRepo.save(n3);
        notepadRepo.save(n4);


        // students =============================================================================

        Student s1 = new Student("Jakub", "Radzik", "20");
        s1.setBackpack(nike);
        Student s2 = new Student("Piotr", "Patalas", "20");
        s2.setBackpack(adidas);

        Set<Student> studentSet = Stream.of(s1,s2).collect(Collectors.toSet());

        //professors =============================================================================
        Professor professor1 = new Professor("Jakub", "Spring", "Java Doctor");
        Professor professor2 = new Professor("Kamil", "Python", "AI Engineer");
        Set<Professor> professorSet = Stream.of(professor1, professor2).collect(Collectors.toSet());

        s1.setProfessorSet(professorSet);
        s2.setProfessorSet(professorSet);
        professor1.setStudentSet(studentSet);
        professor2.setStudentSet(studentSet);

        //rooms
        Room r1 = new Room(1);
        Room r2 = new Room(2);


        professor1.setRoom(r1);
        professor2.setRoom(r2);

        r1.setProfessor(professor1);
        r2.setProfessor(professor2);

        roomRepo.save(r1);
        roomRepo.save(r2);

        professorRepo.save(professor1); //we have mapped by on ManyToMany in Professor class so we need to save them first
        professorRepo.save(professor2);


        studentRepo.save(s1);
        studentRepo.save(s2);
    }

    private void AssignProfessorWithRoom(Room room, Professor professor){
        room.setProfessor(professor);
        professor.setRoom(room);
    }
}
