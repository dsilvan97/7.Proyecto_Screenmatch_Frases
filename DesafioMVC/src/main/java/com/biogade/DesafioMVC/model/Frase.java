package com.biogade.DesafioMVC.model;

import jakarta.persistence.*;

@Entity
@Table(name = "frases")
public class Frase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String textoFrase;
    private String personaje;
    @ManyToOne
    private Serie serie;

    public Frase(String textoFrase, String personaje, Serie serie) {
        this.textoFrase = textoFrase;
        this.personaje = personaje;
        this.serie = serie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTextoFrase() {
        return textoFrase;
    }

    public void setTextoFrase(String textoFrase) {
        this.textoFrase = textoFrase;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }
}
