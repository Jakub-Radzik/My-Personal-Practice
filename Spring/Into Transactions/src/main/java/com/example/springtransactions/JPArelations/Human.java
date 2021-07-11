package com.example.springtransactions.JPArelations;

import lombok.*;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "humans")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Human {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @OneToMany(cascade = CascadeType.ALL)
//    @Column(name = "technology_id")
//    @JoinColumn(name = "technology_id", referencedColumnName = "id")
    private Set<Technology> technologies;

    public Human(String name, Address address, Set<Technology> technologies) {
        this.name = name;
        this.address = address;
        this.technologies = technologies;
    }
}
