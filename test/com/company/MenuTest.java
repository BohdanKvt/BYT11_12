package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

public class MenuTest { 

    Menu menu;

    @Before
    public void before() throws Exception {
        List<Dish> dishes = new ArrayList<>();
        dishes.add(new Dish("test1", "test1", "123", new ArrayList<>()));
        dishes.add(new Dish("test2", "test2", "123", new ArrayList<>()));
        dishes.add(new Dish("test3", "test3", "123", new ArrayList<>()));
        menu = new Menu(dishes);
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testGetDishes() throws Exception {
        Assert.assertEquals("test2", menu.getDishes().get(1).getDishName());
    }

    @Test
    public void testSetDishes() throws Exception {
        List<Dish> dishes = new ArrayList<>();
        dishes.add(new Dish("test3", "test3", "123", new ArrayList<>()));
        dishes.add(new Dish("test2", "test2", "123", new ArrayList<>()));
        dishes.add(new Dish("test1", "test1", "123", new ArrayList<>()));
        menu.setDishes(dishes);
        Assert.assertEquals("test1", menu.getDishes().get(2).getDishName());
    }
} 
