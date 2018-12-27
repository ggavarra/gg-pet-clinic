package com.example.ggpetclinic.services;

import com.example.ggpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by gayathrig on 26/12/2018.
 */
public interface OwnerService {

    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
