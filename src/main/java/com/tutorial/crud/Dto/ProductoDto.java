package com.tutorial.crud.Dto;

import org.springframework.data.repository.NoRepositoryBean;

public class ProductoDto {


    private String nombre;

    private Float precio;

    public ProductoDto() {

    }


    public ProductoDto(String nombre, Float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
}
