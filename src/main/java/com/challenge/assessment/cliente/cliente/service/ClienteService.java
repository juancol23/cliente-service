package com.challenge.assessment.cliente.cliente.service;

import com.challenge.assessment.cliente.cliente.entity.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteService {

    Cliente save(Cliente cliente);
    List<Cliente> findAll();
    void findDeleteAll();

}
