package com.hadleycocen.cs2serverpluginapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

// need to convert to entitys at some point

@Getter
@Setter
@Entity
public class Player {
    @Id
    private Integer id;
    private String username;
    private PlayerStats stats;
}
