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
    private String imagen;
    private String imagen1;
    private String imagen2;
    private String imagen3;
    private String imagen4;


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

    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }

    public String getImagen1() { return imagen1; }
    public void setImagen1(String imagen1) { this.imagen1 = imagen1; }

    public String getImagen2() { return imagen2; }
    public void setImagen2(String imagen2) { this.imagen2 = imagen2; }

    public String getImagen3() { return imagen3; }
    public void setImagen3(String imagen3) { this.imagen3 = imagen3; }

    public String getImagen4() { return imagen4; }
    public void setImagen4(String imagen4) { this.imagen4 = imagen4; }
}
