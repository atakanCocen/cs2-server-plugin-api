package com.hadleycocen.cs2serverpluginapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class PlayerStats {
    @Id
    private Integer id;
    private Integer kills;
    private Integer deaths;
    private Integer damageDealt;
    private Integer roundsPlayed;
    private Player player;
}
