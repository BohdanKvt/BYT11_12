package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

public class EstablishmentAdminTest {

    EstablishmentAdmin establishmentAdmin;

    @Before
    public void before() throws Exception {
        establishmentAdmin = new EstablishmentAdmin("Admin", "881241521", "qwerty@mail.com", "qwerty", "Test", "1234");
    }

    @After
    public void after() throws Exception {

    }

    @Test
    public void testGetNip() throws Exception {
        Assert.assertEquals("1234", establishmentAdmin.getNip());
    }

    @Test
    public void testSetNip() throws Exception {
        establishmentAdmin.setNip("12345");
        Assert.assertEquals("12345", establishmentAdmin.getNip());
        establishmentAdmin.setNip("1234");
    }

} 
