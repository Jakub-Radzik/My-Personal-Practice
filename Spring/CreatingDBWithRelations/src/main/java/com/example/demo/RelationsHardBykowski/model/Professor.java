package com.example.demo.RelationsHardBykowski.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "professors")
@NoArgsConstructor
@Getter
@Setter
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String title;

    @ManyToMany(mappedBy = "professorSet")
    //Many to many mappedBy - we can use mappedBy on one of attr
    //This one with mappedBy we have to save first
    private Set<Student> studentSet;

    @OneToOne
    private Room room;

    public Professor(String name, String surname, String title) {
        this.name = name;
        this.surname = surname;
        this.title = title;
    }
}
