package com.biogade.DesafioMVC.repository;

import com.biogade.DesafioMVC.dto.DatosFrasesDTO;
import com.biogade.DesafioMVC.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;

import java.util.List;

public interface SerieRepository extends JpaRepository<Serie, Long> {

    @NativeQuery("SELECT ROW_NUMBER() OVER () AS id, s.titulo AS titulo, s.poster AS poster, f.texto_frase AS frase, f.personaje AS personaje " +
            "FROM series s JOIN frases f ON s.id = f.serie_id ORDER BY RANDOM() LIMIT 1")
    List<DatosFrasesDTO> obtenerDatosFrases();
}
