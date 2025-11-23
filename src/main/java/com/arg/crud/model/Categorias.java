package com.arg.crud.model;
import jakarta.persistence.*;

@Entity
public class Categorias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_categoria;
    private String nombre_categoria;
    private String descripcion;

    public int  getId_categoria() {
        return id_categoria;
    }
    public void setId_categoria(int id_categoria) {}

    public String getNombre_categoria() {
        return nombre_categoria;
    }
    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public String getDescripcion_Categoria() {
        return descripcion;
    }

    public void setDescripcion_Categoria(String descripcion) {
        this.descripcion = descripcion;
    }

}
