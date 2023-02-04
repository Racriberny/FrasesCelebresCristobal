package com.cristobalbernal.frasescelebrescristobal.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Frase {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "texto", nullable = true, length = 300)
    private String texto;
    @Basic
    @Column(name = "fechaprogramada", nullable = true)
    private Date fechaprogramada;
    @Basic
    @Column(name = "autor_id", nullable = false)
    private int autorId;
    @Basic
    @Column(name = "categoria_id", nullable = false)
    private int categoriaId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getFechaprogramada() {
        return fechaprogramada;
    }

    public void setFechaprogramada(Date fechaprogramada) {
        this.fechaprogramada = fechaprogramada;
    }

    public int getAutorId() {
        return autorId;
    }

    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Frase frase = (Frase) o;

        if (id != frase.id) return false;
        if (autorId != frase.autorId) return false;
        if (categoriaId != frase.categoriaId) return false;
        if (texto != null ? !texto.equals(frase.texto) : frase.texto != null) return false;
        if (fechaprogramada != null ? !fechaprogramada.equals(frase.fechaprogramada) : frase.fechaprogramada != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (texto != null ? texto.hashCode() : 0);
        result = 31 * result + (fechaprogramada != null ? fechaprogramada.hashCode() : 0);
        result = 31 * result + autorId;
        result = 31 * result + categoriaId;
        return result;
    }
}
