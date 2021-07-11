package io.jakub.radzik.tenisplayer;

import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class Player2Repository {
    @PersistenceContext
    EntityManager entityManager;

    public Player2 insertPlayer(Player2 player2){
        return entityManager.merge(player2);
    }

    public Player2 updatePlayer(Player2 player2){
        return entityManager.merge(player2);
    }

    public void removePlayer(int id){
        Player player = entityManager.find(Player.class, id);
        entityManager.remove(player);
    }

    public Player2 getPlayerById(int id) {
        return entityManager.find(Player2.class, id);
    }

    public List<Player2> getAllPlayers(){
        TypedQuery<Player2> getAll = entityManager.createNamedQuery("get_all_players", Player2.class);
        return getAll.getResultList();
    }
}
