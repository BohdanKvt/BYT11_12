package com.company;

import java.time.LocalDateTime;
import java.util.List;

public class Booking {
    private int idBooking;
    private List<Dish> preorderedDishes;
    private LocalDateTime DTbooking;
    private int visitors;
    private int ClientId;
    private int EstId;
    private int AdminId;
    private Status StatusOfBooking;

    public Booking(int idBooking, List<Dish> preorderedDishes, LocalDateTime DTbooking, int visitors, int clientId, int estId, int adminId) {
        this.idBooking = idBooking;
        this.preorderedDishes = preorderedDishes;
        this.DTbooking = DTbooking;
        this.visitors = visitors;
        ClientId = clientId;
        EstId = estId;
        AdminId = adminId;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public List<Dish> getPreorderedDishes() {
        return preorderedDishes;
    }

    public void setPreorderedDishes(List<Dish> preorderedDishes) {
        this.preorderedDishes = preorderedDishes;
    }

    public LocalDateTime getDTbooking() {
        return DTbooking;
    }

    public void setDTbooking(LocalDateTime DTbooking) {
        this.DTbooking = DTbooking;
    }

    public int getVisitors() {
        return visitors;
    }

    public void setVisitors(int visitors) {
        this.visitors = visitors;
    }

    public int getClientId() {
        return ClientId;
    }

    public void setClientId(int clientId) {
        ClientId = clientId;
    }

    public int getEstId() {
        return EstId;
    }

    public void setEstId(int estId) {
        EstId = estId;
    }

    public int getAdminId() {
        return AdminId;
    }

    public void setAdminId(int adminId) {
        AdminId = adminId;
    }

    enum Status{
        Made,
        Confirmed,
        CancelledByCustomer,
        CancelledByAdmin,
        NotExecuted
    }
}
