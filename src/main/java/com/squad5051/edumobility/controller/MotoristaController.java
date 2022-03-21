package com.squad5051.edumobility.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.squad5051.edumobility.model.Motorista;
import com.squad5051.edumobility.repository.MotoristaRepository;

@Controller
@RequestMapping(path = "/driver")
public class MotoristaController {
	@Autowired
	private MotoristaRepository motoristaRepository;

	@PostMapping(path = "/add") // Map ONLY POST Requests
	public @ResponseBody String addNewMotorista(@RequestParam String nome, @RequestParam Date dataDeNascimento,
			@RequestParam String modeloDoVeiculo, @RequestParam String placaDoVeiculo, @RequestParam Long cnh,
			@RequestParam String areaDeAtuacao, @RequestParam String estado, @RequestParam String cidade,
			@RequestParam String rua, @RequestParam String complemento, @RequestParam Long cep) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Motorista m = new Motorista();
		m.setNome(nome);
		m.setDataDeNascimento(dataDeNascimento);
		m.setModeloDoVeiculo(modeloDoVeiculo);
		m.setPlacaDoVeiculo(placaDoVeiculo);
		m.setCnh(cnh);
		m.setAreaDeAtuacao(areaDeAtuacao);
		m.setEstado(estado);
		m.setCidade(cidade);
		m.setRua(rua);
		m.setComplemento(complemento);
		m.setCep(cep);

		motoristaRepository.save(m);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Motorista> getAllMotoristas() {
		// This returns a JSON or XML with the motoristas
		return motoristaRepository.findAll();
	}

}