package com.challenge.assessment.cliente.cliente.repository;

import com.challenge.assessment.cliente.cliente.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ClienteServiceRepositoy extends JpaRepository<Cliente,Integer> {



}
