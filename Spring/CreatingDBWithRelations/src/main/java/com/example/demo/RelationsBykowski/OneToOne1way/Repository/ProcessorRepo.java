package com.example.demo.RelationsBykowski.OneToOne1way.Repository;

import com.example.demo.RelationsBykowski.OneToOne1way.Entity.Processor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessorRepo extends JpaRepository<Processor, Long> {
}
