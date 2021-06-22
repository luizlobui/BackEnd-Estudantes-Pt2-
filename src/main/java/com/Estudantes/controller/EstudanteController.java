package com.Estudantes.controller;
import java.util.List;
import java.util.Optional;

import com.Estudantes.entities.Estudante;
import com.Estudantes.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/estudante")
public class EstudanteController {
    
    @Autowired
    private EstudanteRepository repo;

    @GetMapping
    public List<Estudante> getEstudantes(){

         List<Estudante> lista = repo.findAll();
    
        return lista;

    }
    @GetMapping("{id}")
    public Estudante getEstudante(@PathVariable Long id){

        Optional<Estudante> op = repo.findById(id);
        Estudante estudante = op.orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return estudante;

    }

    

}
