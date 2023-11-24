package com.github.acnaweb.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.acnaweb.ecommerce.model.Indicadores;
import com.github.acnaweb.ecommerce.repository.IndicadoresRepository;

@Service
public class IndicadoresService {
	
	@Autowired
	private IndicadoresRepository indicadoresRepository;
	
	public List<Indicadores> list() {
		return indicadoresRepository.findAll();
	}
	
}
