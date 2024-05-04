package com.backend.egg.controller;

import com.backend.egg.entity.Alveole;
import com.backend.egg.entity.AlveoleParams;
import com.backend.egg.repository.AlveoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class AvioleController {
    @Autowired
    private final AlveoleRepository alveoleRepository;

    public AvioleController(AlveoleRepository alveoleRepository) {
        this.alveoleRepository = alveoleRepository;
    }

    @PostMapping("/api/v1/aviole/add")

    public void add(@RequestBody Alveole alveole){

        alveoleRepository.save(alveole);
    }

    @GetMapping("/api/v1/aviole/liste")
    public Collection<Alveole> getList(){
        return alveoleRepository.findAll();

    }
}
