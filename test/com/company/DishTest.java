package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

public class DishTest { 
Dish dish;
List<String> ingredientsA = new ArrayList<>();
List<String> ingredientsB = new ArrayList<>();


@Before
public void before() throws Exception {
    dish = new Dish("Pizza","desc","12.00",ingredientsA);
} 




@Test
public void testGetDishName() throws Exception {
    Assert.assertEquals(dish.getDishName(),"Pizza");
} 

@Test
public void testSetDishName() throws Exception { 
    dish.setDishName("Cake");
    Assert.assertEquals(dish.getDishName(),"Cake");
} 

@Test
public void testGetDescription() throws Exception { 
    Assert.assertEquals(dish.getDescription(),"desc");
} 

@Test
public void testSetDescription() throws Exception { 
    dish.setDescription("desc2");
    Assert.assertEquals(dish.getDescription(),"desc2");
} 

@Test
public void testGetPrice() throws Exception { 
    Assert.assertEquals(dish.getPrice(),"12.00");
} 

@Test
public void testSetPrice() throws Exception {
    dish.setPrice("5.59");
    Assert.assertEquals(dish.getPrice(),"5.59");
} 

@Test
public void testGetIngredients() throws Exception { 
    Assert.assertEquals(dish.getIngredients(),ingredientsA);
} 

@Test
public void testSetIngredients() throws Exception { 
 dish.setIngredients(ingredientsB);
 Assert.assertEquals(dish.getIngredients(),ingredientsB);
} 


} 
