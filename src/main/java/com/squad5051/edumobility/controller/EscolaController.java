package com.squad5051.edumobility.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.squad5051.edumobility.model.Escola;
import com.squad5051.edumobility.repository.EscolaRepository;

@Controller
@RequestMapping(path = "/school")
public class EscolaController {
	@Autowired
	private EscolaRepository escolaRepository;

	@PostMapping(path = "/add") // Map ONLY POST Requests
	public @ResponseBody String addNewEscola(@RequestParam String nome, @RequestParam Long matriculaEscola,
			@RequestParam String estado, @RequestParam String cidade, @RequestParam String rua,
			@RequestParam String complemento, @RequestParam Long cep) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Escola e = new Escola();
		e.setNome(nome);
		e.setMatriculaEscola(matriculaEscola);
		e.setEstado(estado);
		e.setCidade(cidade);
		e.setRua(rua);
		e.setComplemento(complemento);
		e.setCep(cep);

		escolaRepository.save(e);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Escola> getAllEscolas() {
		// This returns a JSON or XML with the escolas
		return escolaRepository.findAll();
	}
}
