package com.example.ggpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by gayathrig on 29/12/2018.
 */
public abstract class AbstractMapService<T, ID> {

    protected Map<ID, T> map = new HashMap();

    public Set<T> findAll() {
        return new HashSet<T>(map.values());
    }


    public T findById(Object Id) {
        return map.get(Id);
    }


    public T save(ID id, T object) {
        System.out.println("Saving Object" + object);
        map.put(id, object);
        return object;
    }


    public void deleteById(ID id) {
        System.out.println("Deleting Object by ID" + id);
        map.remove(id);
    }


    public void delete(T object) {
        System.out.println("Deleting Object" + object);
        map.entrySet().removeIf(entry ->
                entry.getValue().equals(object)
        );
    }
}
