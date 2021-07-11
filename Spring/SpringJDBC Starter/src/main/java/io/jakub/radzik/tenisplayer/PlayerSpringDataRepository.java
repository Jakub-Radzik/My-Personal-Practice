package io.jakub.radzik.tenisplayer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerSpringDataRepository extends JpaRepository<Player2, Integer> {

}
