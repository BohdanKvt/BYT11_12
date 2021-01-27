package com.company;

public class Table {

    private int id;
    private int numberOfSeats;
    private StatusTypeEnum status;
    private TableLocationEnum location;
    private String tableDescription;

    public enum TableLocationEnum{
        nearWindow,
        inTheMiddle
    }

    public enum StatusTypeEnum{
        blocked,
        available
    }

    public Table(int id, int numberOfSeats, TableLocationEnum location) {
        this.id = id;
        this.numberOfSeats = numberOfSeats;
        this.location = location;
        this.status = StatusTypeEnum.available;
    }

    public Table(int id, int numberOfSeats, TableLocationEnum location, String tableDescription) {
        this.id = id;
        this.numberOfSeats = numberOfSeats;
        this.location = location;
        this.status = StatusTypeEnum.available;
        this.tableDescription = tableDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public StatusTypeEnum getStatus() {
        return status;
    }

    public void setStatus(StatusTypeEnum status) {
        this.status = status;
    }

    public TableLocationEnum getLocation() {
        return location;
    }

    public void setLocation(TableLocationEnum location) {
        this.location = location;
    }

    public String getTableDescription() {
        return tableDescription;
    }

    public void setTableDescription(String tableDescription) {
        this.tableDescription = tableDescription;
    }

}

