package com.hadleycocen.cs2serverpluginapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.hadleycocen.cs2serverpluginapi.model.PlayerStats;

public interface PlayerStatsRepository extends CrudRepository<PlayerStats, Integer> {
    
}
