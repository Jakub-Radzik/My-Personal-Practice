package com.example.demo.RelationsHardBykowski.Repository;

import com.example.demo.RelationsHardBykowski.model.Backpack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BackpackRepo extends JpaRepository<Backpack, Long> {
}
