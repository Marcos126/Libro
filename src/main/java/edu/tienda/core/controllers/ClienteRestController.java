package edu.tienda.core.controllers;

import edu.tienda.core.domain.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/tienda")
public class ClienteRestController{

    private List<Cliente> clientes = new ArrayList<>(Arrays.asList(
        new Cliente("ara","1234","Armstrong"),
        new Cliente("ald","1234","Aldrin"),
        new Cliente("col","1234","Collins")
    )
    );

    @GetMapping("/clientes")
    public List<Cliente> getClientes(){
        return clientes;
    }
    @GetMapping("/clientes/{cliente}")
    public Cliente getClienteByName{};
}
