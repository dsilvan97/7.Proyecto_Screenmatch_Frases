package com.biogade.DesafioMVC.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "series")
public class Serie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String poster;
    @OneToMany(mappedBy = "serie", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Frase> frases;

    public Serie(){}

    public Serie(String titulo, String poster) {
        this.titulo = titulo;
        this.poster = poster;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public List<Frase> getFrases() {
        return frases;
    }

    public void setFrases(List<Frase> frases) {
        this.frases = frases;
    }
}
