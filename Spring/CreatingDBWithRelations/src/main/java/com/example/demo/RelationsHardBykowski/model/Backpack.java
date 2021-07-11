package com.example.demo.RelationsHardBykowski.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "backpacks")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Backpack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String mark;

    //N-1 - two way binding
    @OneToMany(mappedBy = "backpack")//set column name you refer to
    // we refer to Class Notepad to attribute backpack
    private Set<Notepad> notepadSet;


}
