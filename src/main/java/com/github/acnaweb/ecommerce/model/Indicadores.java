package com.github.acnaweb.ecommerce.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "indicadores")
public class Indicadores {
    @Id
    private String id;

    private String descricao;
}
