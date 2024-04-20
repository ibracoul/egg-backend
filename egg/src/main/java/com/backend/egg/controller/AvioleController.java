package com.backend.egg.controller;

import com.backend.egg.entity.Alveole;
import com.backend.egg.entity.AlveoleParams;
import com.backend.egg.repository.AlveoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
public class AvioleController {
    @Autowired
    private final AlveoleRepository alveoleRepository;

    public AvioleController(AlveoleRepository alveoleRepository) {
        this.alveoleRepository = alveoleRepository;
    }

    @PostMapping("/api/v1/aviole/add")
    public void add(@RequestBody Alveole alveole){
        /*Alveole alveole = new Alveole();
        alveole.setNombre(params.nombre());
        alveole.setPrix(params.prix());
        alveole.setDateSortie(params.date());
        alveole.setTaille(params.taille());*/

        alveoleRepository.save(alveole);
    }

    @GetMapping("/api/v1/aviole/liste")
    public Collection<Alveole> getList(){
        return alveoleRepository.findAll();

    }
}
