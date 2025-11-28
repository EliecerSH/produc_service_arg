package com.arg.crud.model;
import jakarta.persistence.*;

@Entity
public class Descuento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_descuento;
    private float descuento_porcentaje;
    private String descripcion;


    public int getId_descuento() {
        return id_descuento;
    }
    public void setId_descuento(int id_descuento) {
        this.id_descuento = id_descuento;
    }

    public float getDescuento_porcentaje() {
        return descuento_porcentaje;
    }
    public void setDescuento_porcentaje(float descuento_porcentaje) {
        this.descuento_porcentaje = descuento_porcentaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
