package com.example.demo.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Jakub Radzik
 * Date: 16.07.2021
 * Time: 14:37
 * To change this template use File | Settings | File and Code Templates.
 */
@Entity
@Table(name = "REGISTRATION")
@Getter
@Setter
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "registration", cascade = CascadeType.ALL)
    private List<Course> courses = new ArrayList<>();
}
