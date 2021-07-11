package com.example.demo.RelationsHardBykowski.Repository;

import com.example.demo.RelationsHardBykowski.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepo extends JpaRepository<Professor, Long> {
}
