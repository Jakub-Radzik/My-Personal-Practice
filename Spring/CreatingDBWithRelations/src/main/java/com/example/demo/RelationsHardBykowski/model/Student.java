package com.example.demo.RelationsHardBykowski.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "students")
@NoArgsConstructor
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String groupNumber;

    @OneToOne
    private Backpack backpack;

    @ManyToMany
    private Set<Professor> professorSet;

    public Student(String name, String surname, String groupNumber) {
        this.name = name;
        this.surname = surname;
        this.groupNumber = groupNumber;
    }
}
