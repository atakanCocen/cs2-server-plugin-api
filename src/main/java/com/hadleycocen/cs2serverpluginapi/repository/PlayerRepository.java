package com.hadleycocen.cs2serverpluginapi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hadleycocen.cs2serverpluginapi.model.Player;

// this our contract 
@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer> {
    public List<Player> findByUsername(String username);
    public Player findById(int id);
    public void deleteById(int id);
}
