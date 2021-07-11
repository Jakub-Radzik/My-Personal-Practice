package com.example.demo.RelationsHardBykowski.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "notepads")
@NoArgsConstructor
@Getter
@Setter
public class Notepad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    //1-N two way binding
    @ManyToOne
    private Backpack backpack;

    public Notepad(String title) {
        this.title = title;
    }
}
