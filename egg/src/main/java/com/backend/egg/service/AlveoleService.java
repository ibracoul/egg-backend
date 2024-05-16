package com.backend.egg.service;

import com.backend.egg.entity.Alveole;
import com.backend.egg.repository.AlveoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AlveoleService {
    @Autowired
    private AlveoleRepository alveoleRepository;
    public Alveole saveAlveole(Alveole alveole) {
        return alveoleRepository.save(alveole);
    }
    public Collection<Alveole> list(){
        return alveoleRepository.findAll();
    }
}
