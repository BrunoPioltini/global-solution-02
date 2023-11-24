package com.github.acnaweb.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "objetivos")
public class Objetivos {
    @Id
    @Column(name = "id")
    private String id;

    @Override
    public String toString() {
        return "id='" + id;
    }
}
