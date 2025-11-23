package com.arg.crud.model;
import jakarta.persistence.*;

@Entity
public class Stack_prod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_stack_arm;
    private int dano;
    private int alcance;
    private int cadencia;
    private int presicion;
    private int movilidad;
    private int capacidad;
    private int rango_efectivo;
    private int durabilidad;
    private int dureza;
    private int peso;

    public int getId_stack() {
        return id_stack_arm;
    }
    public void setId_stack(int id_stack) {
        this.id_stack_arm = id_stack;
    }

    public int getDano() {
        return dano;
    }
    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getAlcance() {
        return alcance;
    }
    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getCadencia() {
        return cadencia;
    }
    public void setCadencia(int cadencia) {
        this.cadencia = cadencia;
    }

    public int getPresicion() {
        return presicion;
    }
    public void setPresicion(int presicion) {
        this.presicion = presicion;
    }

    public int getMovilidad() {
        return movilidad;
    }
    public void setMovilidad(int movilidad) {
        this.movilidad = movilidad;
    }

    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getRango_efectivo() {
        return rango_efectivo;
    }
    public void setRango_efectivo(int rango_efectivo) {
        this.rango_efectivo = rango_efectivo;
    }

    public int getDurabilidad() {
        return durabilidad;
    }
    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    public int getDureza() {
        return dureza;
    }
    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

}
