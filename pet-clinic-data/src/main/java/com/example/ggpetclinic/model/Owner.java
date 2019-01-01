package com.example.ggpetclinic.model;

/**
 * Created by gayathrig on 26/12/2018.
 */
public class Owner extends Person {
    @Override
    public boolean equals(Object obj) {
        return ((Owner) obj).getFirstName().equals(super.getFirstName()) &&
                ((Owner) obj).getLastName().equals(super.getLastName());

    }
}
