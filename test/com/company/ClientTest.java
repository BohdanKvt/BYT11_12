package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 


public class ClientTest {
 Client client;

@Before
public void before() throws Exception {
    client = new Client("Jhon Doe","555-555-0","doe@gmail.com",
            "pass","img",new String[]{"4444","29/20","333"});
}


@Test
public void testGetCardInfo() throws Exception {
    Assert.assertEquals(client.getCardInfo()[1],"29/20");
} 

@Test
public void testSetCardInfo() throws Exception { 
 client.setCardInfo(new String[]{"5555","30/19","234"});
 Assert.assertEquals(client.getCardInfo()[1],"30/19");
} 

} 
