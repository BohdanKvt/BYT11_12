package com.company;

import java.time.LocalDateTime;
import java.util.List;

public class Booking {
    private int id;
    private List<Dish> orderedDishes;
    private LocalDateTime time;
    private int visitors;
    private int clientId;
    private int establishmentId;
    private int adminId;
    private Status statusOfBooking;

    public Booking(int id, List<Dish> orderedDishes, LocalDateTime time, int visitors, int clientId, int establishmentId, int adminId) {
        this.id = id;
        this.orderedDishes = orderedDishes;
        this.time = time;
        this.visitors = visitors;
        this.clientId = clientId;
        this.establishmentId = establishmentId;
        this.adminId = adminId;
        this.statusOfBooking = Status.Made;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getEstablishmentId() {
        return establishmentId;
    }

    public void setEstablishmentId(int establishmentId) {
        this.establishmentId = establishmentId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
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
