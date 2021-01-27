package com.company;

import java.time.LocalDateTime;
import java.util.List;

public class Booking {

    private List<Dish> orderedDishes;
    private LocalDateTime time;
    private int visitors;
    private Client client;
    private Table table;
    private Status statusOfBooking;

    public Booking(List<Dish> orderedDishes, LocalDateTime time, int visitors, Client client, Table table) {
        this.orderedDishes = orderedDishes;
        this.time = time;
        this.visitors = visitors;
        this.client = client;
        this.table = table;
        this.statusOfBooking = Status.Made;
    }

    public List<Dish> getOrderedDishes() {
        return orderedDishes;
    }

    public void setOrderedDishes(List<Dish> orderedDishes) {
        this.orderedDishes = orderedDishes;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public int getVisitors() {
        return visitors;
    }

    public void setVisitors(int visitors) {
        this.visitors = visitors;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Status getStatusOfBooking() {
        return statusOfBooking;
    }

    public void setStatusOfBooking(Status statusOfBooking) {
        this.statusOfBooking = statusOfBooking;
    }

    public enum Status {
        Made,
        Confirmed,
        CancelledByCustomer,
        CancelledByAdmin,
        NotExecuted
    }
}
