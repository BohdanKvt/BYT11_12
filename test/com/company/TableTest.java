package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

public class TableTest { 

    Table table;

    @Before
    public void before() throws Exception {
        table = new Table(1, 4, Table.TableLocationEnum.inTheMiddle, "Good");
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testGetId() throws Exception {
        Assert.assertEquals(1, table.getId());
    }

    @Test
    public void testSetId() throws Exception {
        table.setId(2);
        Assert.assertEquals(2, table.getId());
        table.setId(1);
    }

    @Test
    public void testGetNumberOfSeats() throws Exception {
        Assert.assertEquals(4, table.getNumberOfSeats());
    }

    @Test
    public void testSetNumberOfSeats() throws Exception {
        table.setNumberOfSeats(5);
        Assert.assertEquals(5, table.getNumberOfSeats());
        table.setNumberOfSeats(4);
    }

    @Test
    public void testGetStatus() throws Exception {
        Assert.assertEquals(Table.StatusTypeEnum.available, table.getStatus());
    }

    @Test
    public void testSetStatus() throws Exception {
        table.setStatus(Table.StatusTypeEnum.blocked);
        Assert.assertEquals(Table.StatusTypeEnum.blocked, table.getStatus());
        table.setStatus(Table.StatusTypeEnum.available);
    }

    @Test
    public void testGetLocation() throws Exception {
        Assert.assertEquals(Table.TableLocationEnum.inTheMiddle, table.getLocation());
    }

    @Test
    public void testSetLocation() throws Exception {
        table.setLocation(Table.TableLocationEnum.nearWindow);
        Assert.assertEquals(Table.TableLocationEnum.nearWindow, table.getLocation());
        table.setLocation(Table.TableLocationEnum.inTheMiddle);
    }

    @Test
    public void testGetTableDescription() throws Exception {
        Assert.assertEquals("Good", table.getTableDescription());
    }

    @Test
    public void testSetTableDescription() throws Exception {
        table.setTableDescription("Bad");
        Assert.assertEquals("Bad", table.getTableDescription());
        table.setTableDescription("Good");
    }

} 
