package org.example.services;
import org.example.models.Cliente;
import org.example.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public void save(Cliente cliente){
        clienteRepository.save(cliente);
    }
    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }
}
