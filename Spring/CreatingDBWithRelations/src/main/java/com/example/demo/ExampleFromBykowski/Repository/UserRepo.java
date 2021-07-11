package com.example.demo.ExampleFromBykowski.Repository;

import com.example.demo.ExampleFromBykowski.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
