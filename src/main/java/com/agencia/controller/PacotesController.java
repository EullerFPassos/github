package com.agencia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.agencia.model.Pacotes;
import com.agencia.repository.PacotesRepository;

@RestController
@RequestMapping("/pacotes")
public class PacotesController {
	
	@Autowired
	private PacotesRepository PacotesRepository;
	
	@GetMapping
	public List<Pacotes> mostrarPacotes() {
		return PacotesRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Pacotes inserir(@RequestBody Pacotes pacotes) {
		return PacotesRepository.save(pacotes);
	}
	
	@DeleteMapping
	public void deletar(@RequestBody Pacotes pacotes) {
		PacotesRepository.delete(pacotes);
	}
	
	@PutMapping
	public Pacotes atualizar(@RequestBody Pacotes pacotes) {
		return PacotesRepository.save(pacotes);
	}
}
