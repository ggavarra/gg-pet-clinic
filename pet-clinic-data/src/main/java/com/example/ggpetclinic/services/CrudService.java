package com.example.ggpetclinic.services;


import java.util.Set;

/**
 * Created by gayathrig on 28/12/2018.
 */
public interface CrudService<T,ID> {

    Set<T> findAll();
    T findById(Object ID);
    T save(T object);
    void delete(ID object);


}
