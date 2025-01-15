package com.biogade.DesafioMVC.service;

import com.biogade.DesafioMVC.dto.DatosFrasesDTO;
import com.biogade.DesafioMVC.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieService {

    @Autowired
    private SerieRepository repository;


    public List<DatosFrasesDTO> obtenerTodosDatosFrases() {
        return repository.obtenerDatosFrases();
    }
}
