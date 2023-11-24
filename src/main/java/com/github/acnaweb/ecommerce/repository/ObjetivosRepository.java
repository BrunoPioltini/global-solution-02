package com.github.acnaweb.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.acnaweb.ecommerce.model.Objetivos;

@Repository
public interface ObjetivosRepository
	extends JpaRepository<Objetivos, String> {

}