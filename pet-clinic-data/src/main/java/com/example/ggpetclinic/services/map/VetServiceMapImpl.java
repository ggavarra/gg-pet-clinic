package com.example.ggpetclinic.services.map;

import com.example.ggpetclinic.model.Vet;
import com.example.ggpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by gayathrig on 29/12/2018.
 */
public class VetServiceMapImpl extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Object Id) {
        return super.findById(Id);
    }

    @Override
    public Vet save(Long aLong, Vet object) {
        return super.save(aLong, object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

}
