package com.hadleycocen.cs2serverpluginapi.service;

import com.hadleycocen.cs2serverpluginapi.model.Player;
import com.hadleycocen.cs2serverpluginapi.repository.PlayerRepository;

public class PlayerStatsService {
    private final PlayerRepository playerRepository;

    public PlayerStatsService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    // add methods around logic for player stats
    // in method first playerRepository.findById then...

    public void increasePlayerKillCount(int playerId, int kills) {
        Player player = playerRepository.findById(playerId);
        Integer updatedKills = player.getStats().getKills() + kills;
        player.getStats().setKills(updatedKills);
        playerRepository.save(player);
    }

    // similar methods for other stats we'd want. 

}
