package edu.tienda.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cliente { 
    private String username;
    private String password;
    private String nombre;
}
