package io.jakub.radzik.tenisplayer;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="Player2")
@NamedQuery(name="get_all_players", query="select p from Player2 p")
public class Player2 {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @Column(name = "nationality")
    private String nationality;
    private Date birthDate;
    private int titles;

    public Player2(int id, String name, String nationality, Date birthDate, int titles) {
        super();
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.birthDate = birthDate;
        this.titles = titles;
    }
    public Player2(String name, String nationality, Date birthDate, int titles) {
        super();
        this.name = name;
        this.nationality = nationality;
        this.birthDate = birthDate;
        this.titles = titles;
    }
    public Player2() {
    }
}
