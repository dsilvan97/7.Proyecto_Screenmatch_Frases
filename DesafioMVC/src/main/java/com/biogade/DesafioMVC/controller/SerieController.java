package com.biogade.DesafioMVC.controller;

import com.biogade.DesafioMVC.dto.DatosFrasesDTO;
import com.biogade.DesafioMVC.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SerieController {

    @Autowired SerieService servicio;

    @GetMapping("/frases")
    public List<DatosFrasesDTO> obtenerDatosFrases(){
        return servicio.obtenerTodosDatosFrases();
    }

}
