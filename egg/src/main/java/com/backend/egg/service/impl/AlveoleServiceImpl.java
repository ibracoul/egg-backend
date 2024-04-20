package com.backend.egg.service.impl;

import com.backend.egg.entity.Alveole;
import com.backend.egg.repository.AlveoleRepository;
import com.backend.egg.service.AlveoleService;

public class AlveoleServiceImpl implements AlveoleService {
    private final AlveoleRepository alveoleRepository;

    public AlveoleServiceImpl(AlveoleRepository alveoleRepository) {
        this.alveoleRepository = alveoleRepository;
    }

    @Override
    public Alveole saveStudent(Alveole alveole) {
        return alveoleRepository.save(alveole);
    }
}
