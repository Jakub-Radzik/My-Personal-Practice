package com.example.demo.Repository;

import com.example.demo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserStatsRepository extends JpaRepository<User, Long> {

    @Query("SELECT count(u) from User u")
    Long getPersonCount();

    @Query("FROM User u WHERE u.firstname = :firstname")
    User findByName(@Param("firstname") String firstname);
}
