package com.example.ggpetclinic.services.map;

import com.example.ggpetclinic.model.Owner;
import com.example.ggpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by gayathrig on 29/12/2018.
 */
public class OwnerServiceMapImpl extends AbstractMapService<Owner, Long> implements CrudService<Owner,Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Object Id) {
        return super.findById(Id);
    }

    @Override
    public Owner save(Long aLong, Owner object) {
        return super.save(aLong, object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }
}

