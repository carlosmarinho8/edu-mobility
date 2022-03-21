package com.squad5051.edumobility.repository;


import org.springframework.data.repository.CrudRepository;
import com.squad5051.edumobility.model.Aluno;

public interface AlunoRepository extends CrudRepository <Aluno, Long> {
	
}

