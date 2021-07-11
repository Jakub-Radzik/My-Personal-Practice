package com.example.springtransactions.JPArelations;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String street;
    private int number;

    @OneToOne(mappedBy = "address")
    private Human human;

    public Address(String street, int number) {
        this.street = street;
        this.number = number;
    }
}
