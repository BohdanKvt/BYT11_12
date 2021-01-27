package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

public class UserTest {

    User user;

    @Before
    public void before() throws Exception {
        user = new User("User", "876125661", "qwerty@mail.com", "qwerty", "test");
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testGetFullName() throws Exception {
        Assert.assertEquals("User", user.getFullName());
    }

    @Test
    public void testSetFullName() throws Exception {
        user.SetFullName("Usser");
        Assert.assertEquals("Usser", user.getFullName());
        user.SetFullName("User");
    }

    @Test
    public void testGetPhone() throws Exception {
        Assert.assertEquals("876125661", user.getPhone());
    }

    @Test
    public void testSetPhone() throws Exception {
        user.SetPhone("876125662");
        Assert.assertEquals("876125662", user.getPhone());
        user.SetPhone("876125661");
    }

    @Test
    public void testGetEmail() throws Exception {
        Assert.assertEquals("qwerty@mail.com", user.getEmail());
    }

    @Test
    public void testSetEmail() throws Exception {
        user.setEmail("qwerty@mail.pl");
        Assert.assertEquals("qwerty@mail.pl", user.getEmail());
        user.setEmail("qwerty@mail.com");
    }

    @Test
    public void testGetPassword() throws Exception {
        Assert.assertEquals("qwerty", user.getPassword());
    }

    @Test
    public void testSetPassword() throws Exception {
        user.setPassword("12345");
        Assert.assertEquals("12345", user.getPassword());
        user.setPassword("qwerty");
    }

    @Test
    public void testGetImage() throws Exception {
        Assert.assertEquals("test", user.getImage());
    }

    @Test
    public void testSetImage() throws Exception {
        user.setImage("tesst");
        Assert.assertEquals("tesst", user.getImage());
        user.setImage("test");
    }

} 
