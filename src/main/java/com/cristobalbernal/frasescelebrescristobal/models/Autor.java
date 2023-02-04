package com.cristobalbernal.frasescelebrescristobal.models;

import jakarta.persistence.*;

@Entity
public class Autor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nombre", nullable = true, length = 128)
    private String nombre;
    @Basic
    @Column(name = "nacimiento", nullable = true)
    private Integer nacimiento;
    @Basic
    @Column(name = "muerte", nullable = true, length = 5)
    private String muerte;
    @Basic
    @Column(name = "profesion", nullable = true, length = 255)
    private String profesion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Integer nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getMuerte() {
        return muerte;
    }

    public void setMuerte(String muerte) {
        this.muerte = muerte;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Autor autor = (Autor) o;

        if (id != autor.id) return false;
        if (nombre != null ? !nombre.equals(autor.nombre) : autor.nombre != null) return false;
        if (nacimiento != null ? !nacimiento.equals(autor.nacimiento) : autor.nacimiento != null) return false;
        if (muerte != null ? !muerte.equals(autor.muerte) : autor.muerte != null) return false;
        if (profesion != null ? !profesion.equals(autor.profesion) : autor.profesion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (nacimiento != null ? nacimiento.hashCode() : 0);
        result = 31 * result + (muerte != null ? muerte.hashCode() : 0);
        result = 31 * result + (profesion != null ? profesion.hashCode() : 0);
        return result;
    }
}
