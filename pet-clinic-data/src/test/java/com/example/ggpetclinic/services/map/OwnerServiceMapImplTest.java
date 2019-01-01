package com.example.ggpetclinic.services.map;

import com.example.ggpetclinic.model.Owner;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by gayathrig on 01/01/2019.
 */
public class OwnerServiceMapImplTest {

    OwnerServiceMapImpl ownerServiceMap;

    @Before
    public void setUp() throws Exception {
        ownerServiceMap = new OwnerServiceMapImpl();
    }

    @Test
    public void saveOwner() {

        Owner owner = new Owner();
        owner.setFirstName("Gayathri");
        owner.setLastName("Gavarraju");
        saveOwner(new Long(1), owner);
        assertEquals(owner.getFirstName(), ((Owner) ownerServiceMap.findById(new Long(1))).getFirstName());
        assertEquals(owner.getLastName(), ((Owner) ownerServiceMap.findById(new Long(1))).getLastName());
    }


    private void saveOwner(Long id, Owner owner) {
        ownerServiceMap.save(new Long(id), owner);
    }

    @Test
    public void deleteOwnerById() {
        saveOwner(new Long(1), new Owner());
        saveOwner(new Long(2), new Owner());
        ownerServiceMap.deleteById(new Long(1));
        assertNull(ownerServiceMap.findById(new Long(1)));
        assertNotNull(ownerServiceMap.findById(new Long(2)));
    }

}