package io.radzik.Services;

import io.radzik.Model.Player;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

@Service
public class PlayerService {
    private List<Player> players = Arrays.asList(
            new Player(1, "Djokovic", "Serbia", new Date(1987- 5 -22), 81),
            new Player(2, "Monfils", "France", new Date(1986- 7 - 1), 10),
            new Player(3, "Isner", "USA", new Date(1985- 4 -26), 15)
    );

    public Player getPlayerByName(String name){
        return players.stream().filter(p -> p.getName().equals(name)).findFirst().get();
    }
}
