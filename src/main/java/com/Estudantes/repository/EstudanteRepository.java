package com.Estudantes.repository;

import com.Estudantes.entities.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository <Estudante,Long>{
    
}