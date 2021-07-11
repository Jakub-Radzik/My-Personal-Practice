package io.jakub.radzik.tenisplayer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.Date;

@SpringBootApplication
public class JPAApp implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

//    @Autowired
//    PlayerDAO dao;

    public static void main(String[] args) {
        SpringApplication.run(TenisPlayerApplication.class, args);
    }

    @Autowired
    PlayerSpringDataRepository repo;

    @Override
    public void run(String... args) throws Exception {
        logger.info("Inserting Player: {}", repo.save(new Player2("Djokovic", "Serbia", Date.valueOf("1987-05-22"), 81)));
        logger.info("Inserting Player: {}", repo.save(new Player2("Monfils", "France", Date.valueOf("1986-09-01"), 10)));
        logger.info("Inserting Player: {}", repo.save(new Player2("Thiem", "Austria", Date.valueOf("1993-09-03"), 17)));
        logger.info("All Players Data: {}", repo.findAll());
    }

//
//    @Override
//    public void run(String... args) throws Exception {
//        dao.createTournamentTable();
//        logger.info("All players Data: {}", dao.insertPlayer(new Player
//                                            (4, "Thiem", "Austria",
//                                            new Date(System.currentTimeMillis()),
//                                            17 )));
//        logger.info("update: {}", dao.updatePlayer(
//                new Player(4, "Thiem", "Austria",
//                        Date.valueOf("1993-09-03"), 17)));
//
//        logger.info("All players Data: {}", dao.getAllPlayers());
//        logger.info("French Players: {}", dao.getPlayerByNationality("France"));
//    }
}
