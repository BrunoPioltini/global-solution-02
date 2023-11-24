package com.github.acnaweb.ecommerce.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static java.util.stream.Collectors.toList;

import com.github.acnaweb.ecommerce.service.IndicadoresService;
import com.github.acnaweb.ecommerce.service.ObjetivosService;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {

	@Autowired
	private IndicadoresService indicadorService;
	@Autowired
	private ObjetivosService objetivosService;
	@Autowired
	private  ModelMapper modelMapper;


	@GetMapping
	public ResponseEntity<List<ObjetivosDto>> listAllObjetivos() {
		List<ObjetivosDto> list = objetivosService.list().stream().map(objetivo -> modelMapper.map(objetivo, ObjetivosDto.class)).collect(toList()); ;
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@GetMapping("/{id}/indicadores")
	public ResponseEntity<List<IndicadoresDTO>> listAllIndicadoresByObjetivo(@PathVariable String id) {
		if (!objetivosService.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		List<IndicadoresDTO> list = indicadorService.list().stream().map(objetivo -> modelMapper.map(objetivo, IndicadoresDTO.class)).collect(toList()); ;
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
}






