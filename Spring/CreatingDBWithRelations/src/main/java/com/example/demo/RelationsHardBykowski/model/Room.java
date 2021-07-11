package com.example.demo.RelationsHardBykowski.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "rooms")
@Getter
@Setter
@NoArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int number;

    @OneToOne(mappedBy = "room", cascade = CascadeType.ALL)
    private Professor professor;

    public Room(int number) {
        this.number = number;
    }
}
