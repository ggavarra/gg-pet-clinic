package com.example.ggpetclinic.services.map;

import com.example.ggpetclinic.model.Pet;
import com.example.ggpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by gayathrig on 29/12/2018.
 */
public class PetServiceMapImpl extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Object Id) {
        return super.findById(Id);
    }

    @Override
    public Pet save(Long aLong, Pet object) {
        return super.save(aLong, object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

}
