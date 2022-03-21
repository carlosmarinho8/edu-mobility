package com.squad5051.edumobility.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.squad5051.edumobility.model.Aluno;
import com.squad5051.edumobility.repository.AlunoRepository;

@Controller
@RequestMapping(path = "/student")
public class AlunoController {
	@Autowired
	private AlunoRepository alunoRepository;

	@PostMapping(path = "/add") // Map ONLY POST Requests
	public @ResponseBody String addNewAluno(@RequestParam String nome, @RequestParam Long nis,
			@RequestParam Date dataDeNascimento, @RequestParam String escolaMatriculada, @RequestParam String estado,
			@RequestParam String cidade, @RequestParam String rua, @RequestParam String complemento,
			@RequestParam Long cep) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Aluno a = new Aluno();
		a.setNome(nome);
		a.setNis(nis);
		a.setDataDeNascimento(dataDeNascimento);
		a.setEscolaMatriculada(escolaMatriculada);
		a.setEstado(estado);
		a.setCidade(cidade);
		a.setRua(rua);
		a.setComplemento(complemento);
		a.setCep(cep);
	

		alunoRepository.save(a);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Aluno> getAllAlunos() {
		// This returns a JSON or XML with the alunos
		return alunoRepository.findAll();
	}

}
