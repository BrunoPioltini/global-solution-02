package com.github.acnaweb.ecommerce.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.acnaweb.ecommerce.model.Objetivos;
import com.github.acnaweb.ecommerce.repository.ObjetivosRepository;

import java.util.List;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ObjetivosService {
	
	@Autowired
	private ObjetivosRepository objetivosRepository;

	public List<Objetivos> list() {
		return objetivosRepository.findAll();
	}
	
	public Boolean existsById(String id) {
		return objetivosRepository.existsById(id);
	}
	

}
