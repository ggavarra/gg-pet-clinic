package com.example.ggpetclinic.services;

import com.example.ggpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by gayathrig on 26/12/2018.
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
