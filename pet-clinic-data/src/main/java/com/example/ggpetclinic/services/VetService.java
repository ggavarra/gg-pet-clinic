package com.example.ggpetclinic.services;

import com.example.ggpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by gayathrig on 26/12/2018.
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet pet);

    Set<Vet> findAll();

}
