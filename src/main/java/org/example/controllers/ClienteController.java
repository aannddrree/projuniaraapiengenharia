package org.example.controllers;

import org.example.models.Cliente;
import org.example.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping("api/cliente")
    public  void save(@RequestBody Cliente cliente){
        clienteService.save(cliente);
    }

    @GetMapping("api/cliente")
    public List<Cliente> findAll(){
        return clienteService.findAll();
    }
}
