package com.example.demo.RelationsHardBykowski.Repository;

import com.example.demo.RelationsHardBykowski.model.Notepad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotepadRepo extends JpaRepository<Notepad, Long> {
}
