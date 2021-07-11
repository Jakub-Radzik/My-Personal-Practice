package com.example.demo.RelationsBykowski.OneToOne1way.Service;

import com.example.demo.RelationsBykowski.OneToOne1way.Entity.Computer;
import com.example.demo.RelationsBykowski.OneToOne1way.Entity.Processor;
import com.example.demo.RelationsBykowski.OneToOne1way.Repository.ComputerRepo;
import com.example.demo.RelationsBykowski.OneToOne1way.Repository.ProcessorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElectronicManager {

    @Autowired
    public ElectronicManager(ComputerRepo computerRepo, ProcessorRepo processorRepo) {
        Processor processor = new Processor();
        processor.setName("Intel i5");
        processorRepo.save(processor);

        Computer computer = new Computer();
        computer.setProcessor(processor);
        computerRepo.save(computer);
    }
}
