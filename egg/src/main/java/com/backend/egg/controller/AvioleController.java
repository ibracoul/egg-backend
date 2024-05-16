package com.backend.egg.controller;

import com.backend.egg.entity.Alveole;
import com.backend.egg.service.AlveoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@RestController
public class AvioleController {
    @Autowired
    private AlveoleService alveoleService;
    @PostMapping("/api/v1/aviole/add")
    public void add(@RequestBody Alveole alveole){
        alveoleService.saveAlveole(alveole);
    }
    @GetMapping("/api/v1/aviole/liste")
    public Collection<Alveole> getList(){
        return alveoleService.list();
    }
}
