package com.arg.crud.model;
import jakarta.persistence.*;


@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_producto;
    private String nombre;
    private float precio;
    private int stock;
    private int id_categoria;
    private int id_descuento;
    private int id_stack_prod;
    private int id_descripcion;


    //G Y S
    public long getId() { return id_producto; }
    public void setId(int id) { this.id_producto = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public float getPrecio() { return precio; }
    public void setPrecio(float precio) { this.precio = precio; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public int getId_categoria() { return id_categoria; }
    public void setId_categoria(int id_categoria) { this.id_categoria = id_categoria; }

    public int getId_descuento() { return id_descuento; }
    public void setId_descuento(int id_descuento) { this.id_descuento = id_descuento;}

    public int getId_tack_prod() { return id_stack_prod; }
    public void setId_tack_prod(int id_tack_prod) { this.id_stack_prod = id_tack_prod; }

    public int getId_descripcion() { return id_descripcion; }
    public void setId_descripcion(int id_descripcion) { this.id_descripcion = id_descripcion; }
}


