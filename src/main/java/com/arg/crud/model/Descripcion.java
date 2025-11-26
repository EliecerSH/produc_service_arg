package com.arg.crud.model;
import jakarta.persistence.*;

@Entity
public class Descripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id_descripcion;
    private String descripcion;
    private String ventaja;
    private String desventaja;
    private String uso_recomendado;
    private String nota;
    private String imagen_1;
    private String imagen_2;
    private String imagen_3;
    private String imagen_4;


    public int getId() { return id_descripcion; }
    public void setId(int id) { this.id_descripcion = id; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getVentaja() { return ventaja; }
    public void setVentaja(String ventaja) { this.ventaja = ventaja; }

    public String getDesventaja() { return desventaja; }
    public void  setDesventaja(String desventaja) { this.desventaja = desventaja; }

    public String getUso_recomendado() { return uso_recomendado; }
    public void  setUso_recomendado() { this.uso_recomendado = uso_recomendado; }

    public String getNota() { return nota; }
    public void setNota(String nota) { this.nota = nota; }

    public String getImagen1() { return imagen_1; }
    public void setImagen1(String imagen1) { this.imagen_1 = imagen1; }

    public String getImagen2() { return imagen_2; }
    public void setImagen2(String imagen2) { this.imagen_2 = imagen2; }

    public String getImagen3() { return imagen_3; }
    public void setImagen3(String imagen3) { this.imagen_3 = imagen3; }

    public String getImagen4() { return imagen_4; }
    public void setImagen4(String imagen4) { this.imagen_4 = imagen4; }
}
