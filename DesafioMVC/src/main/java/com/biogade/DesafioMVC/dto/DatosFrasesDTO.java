package com.biogade.DesafioMVC.dto;

public class DatosFrasesDTO {
    private Long id;
    private String titulo;
    private String poster;
    private String frase;
    private String personaje;

    public DatosFrasesDTO(Long id, String titulo, String poster, String frase, String personaje) {
        this.id = id;
        this.titulo = titulo;
        this.poster = poster;
        this.frase = frase;
        this.personaje = personaje;
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

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }
}
