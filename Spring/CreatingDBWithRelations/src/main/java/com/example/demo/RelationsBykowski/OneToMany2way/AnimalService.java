package com.example.demo.RelationsBykowski.OneToMany2way;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    @Autowired
    private ZooRepo zooRepo;

    @Autowired
    private AnimalRepo animalRepo;

    @EventListener(ApplicationReadyEvent.class)
    public void run(){
        Zoo zoo = new Zoo();
        zooRepo.save(zoo);

        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        animal1.setZoo(zoo);
        animal2.setZoo(zoo);

        animalRepo.save(animal1);
        animalRepo.save(animal2);
    }



}
