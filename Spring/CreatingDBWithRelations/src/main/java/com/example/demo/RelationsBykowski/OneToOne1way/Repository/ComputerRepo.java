package com.example.demo.RelationsBykowski.OneToOne1way.Repository;

import com.example.demo.RelationsBykowski.OneToOne1way.Entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerRepo extends JpaRepository<Computer, Long> {
}
