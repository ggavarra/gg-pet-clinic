package com.example.ggpetclinic.model;

import java.io.Serializable;

/**
 * Created by gayathrig on 27/12/2018.
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
