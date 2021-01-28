package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 


public class CityTest {
    City city;

@Before
public void before() throws Exception {
    city = new City("Warsaw","Poland");
} 



@Test
public void testGetCountry() throws Exception {
    Assert.assertEquals(city.getCountry(),"Poland");
} 


@Test
public void testSetCountry() throws Exception { 
    city.setCountry("France");
    Assert.assertEquals(city.getCountry(),"France");
} 


@Test
public void testGetName() throws Exception { 
    Assert.assertEquals(city.getName(),"Warsaw");
} 

@Test
public void testSetName() throws Exception { 
    city.setName("Paris");
    Assert.assertEquals(city.getName(),"Paris");
} 

} 
