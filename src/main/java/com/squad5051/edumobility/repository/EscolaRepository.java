package com.squad5051.edumobility.repository;


import org.springframework.data.repository.CrudRepository;
import com.squad5051.edumobility.model.Escola;

public interface EscolaRepository extends CrudRepository <Escola, Long> {
	
}
