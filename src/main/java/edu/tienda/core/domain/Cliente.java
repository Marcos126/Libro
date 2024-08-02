package edu.tienda.core.domain;


public class Cliente { 
    private String username;
    private String password;
    private String nombre;

    public Cliente(String username,String password,String nombre){
        this.username = username;
        this.password = password;
        this.nombre = nombre;

    }

    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public String getNombre(){
        return nombre;
    }
}
