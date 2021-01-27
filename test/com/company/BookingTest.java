package com.company;

import javafx.scene.control.Tab;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


public class BookingTest {
    Client clientA;
    Client clientB;
    Table tableA;
    Table tableB;
    Booking bookingA;
    List<Dish> orderedDishesA;
    List<Dish> orderedDishesB;
    LocalDateTime localDateTimeA;
    LocalDateTime localDateTimeB;


@Before
public void before() throws Exception {
    clientA = new Client("Jhon Doe","555-555-0","doe@gmail.com",
            "pass","img",new String[]{"4444","29/20","333"});
    clientA = new Client("Alex Brown","555-555-0","doe@gmail.com",
            "pass","img",new String[]{"4444","29/20","333"});

    tableA = new Table(12,4, Table.TableLocationEnum.inTheMiddle);
    tableB = new Table(13,5, Table.TableLocationEnum.nearWindow);

    localDateTimeA = LocalDateTime.of(2019, 03, 28, 14, 33, 48, 123456789);
    localDateTimeB = LocalDateTime.of(2020, 03, 28, 14, 33, 48, 123456789);

    List<String> ingredients = new ArrayList<>();
    orderedDishesA.add(new Dish("Pizza","desc","12.00",ingredients));
    orderedDishesB.add(new Dish("Cake","desc","12.00",ingredients));

    bookingA = new Booking(orderedDishesA,localDateTimeA,4,clientA,tableA);
}


@Test
public void testGetOrderedDishes() throws Exception {
    Assert.assertEquals(bookingA.getOrderedDishes().get(0).getDishName(),"Pizza");
}

@Test
public void testSetOrderedDishes() throws Exception { 
    bookingA.setOrderedDishes(orderedDishesB);
    Assert.assertEquals(bookingA.getOrderedDishes().get(0).getDishName(),"Cake");
} 

@Test
public void testGetTime() throws Exception { 
    Assert.assertEquals(bookingA.getTime(),localDateTimeA);
} 

@Test
public void testSetTime() throws Exception { 
    bookingA.setTime(localDateTimeB);
    Assert.assertEquals(bookingA.getTime(),localDateTimeB);
} 

@Test
public void testGetVisitors() throws Exception { 
    Assert.assertEquals(bookingA.getVisitors(),4);
} 


@Test
public void testSetVisitors() throws Exception {
    bookingA.setVisitors(2);
    Assert.assertEquals(bookingA.getVisitors(),2);
} 

@Test
public void testGetClient() throws Exception { 
    Assert.assertEquals(bookingA.getClient().getFullName(),"Jhon Doe");
} 


@Test
public void testSetClient() throws Exception { 
    bookingA.setClient(clientB);
    Assert.assertEquals(bookingA.getClient().getFullName(),"Alex Brown");
} 

@Test
public void testGetTable() throws Exception { 
    Assert.assertEquals(bookingA.getTable().getId(),12);
} 

@Test
public void testSetTable() throws Exception { 
    bookingA.setTable(tableB);
    Assert.assertEquals(bookingA.getTable().getId(),13);
} 

@Test
public void testGetRejectionReason() throws Exception { 
    Assert.assertEquals(bookingA.getRejectionReason(),"");
} 

@Test
public void testSetRejectionReason() throws Exception { 
  bookingA.setRejectionReason("123");
  Assert.assertEquals(bookingA.getRejectionReason(),"123");
} 

@Test
public void testGetStatusOfBooking() throws Exception { 
    Assert.assertEquals(bookingA.getStatusOfBooking(), Booking.Status.Made);

} 

@Test
public void testSetStatusOfBooking() throws Exception { 
    bookingA.setStatusOfBooking(Booking.Status.Confirmed);
    Assert.assertEquals(bookingA.getStatusOfBooking(), Booking.Status.Confirmed);
} 


} 
