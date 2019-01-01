package com.example.ggpetclinic.services.map;

import com.example.ggpetclinic.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Created by gayathrig on 29/12/2018.
 */
public abstract class AbstractMapService<T,ID> implements CrudService<T,ID> {

    protected  Map<ID,T> map =new HashMap();
    @Override
    public Set<T> findAll() {
        return new HashSet<T>(map.values());
    }


    @Override
    public T findById(Object Id) {
        return map.get(Id);
    }


    @Override
    public T save(ID id, T object) {
        map.put(id,object);
        return object;
    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);
    }

    @Override
    public void delete(T object) {
        map.entrySet().stream().filter(idtEntry -> idtEntry.getValue().equals(object));
    }
}
