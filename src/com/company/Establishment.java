package com.company;

import java.util.List;

public class Establishment {

    private String name, description, address, contacts;
    private City city;
    private String[] imageList;
    private String workHours;
    private Menu menu;
    private double rating;
    private List<Table> tables;


    public Establishment(String name, String description, String address, String contacts, City city, String[] imageList,
                         String workHours, double rating, List<Table> tables, Menu menu) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.contacts = contacts;
        this.imageList = imageList;
        this.workHours = workHours;
        this.city = city;
        this.rating = rating;
        this.tables = tables;
        this.menu = menu;
    }

    public String getName(){
        return this.name;
    }

    public void seName(String name){
        this.name = name;
    }


    public void setDescription(String newDesc){
        this.description = newDesc;
    }

    public String getDescription(){
        return this.description;
    }


    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return this.address;
    }


    public void setContacts(String contacts){
        this.contacts = contacts;
    }

    public String getContacts(){
        return this.contacts;
    }


    public void setWorkHours(String workHours){
        this.workHours = workHours;
    }

    public String getWorkHours(){
        return this.workHours;
    }

    public void setRating(double rating){
        this.rating = rating;
    }

    public double getRating(){
        return this.rating;
    }

    public List<Table> getTables() {
        return this.tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String[] getImageList() {
        return imageList;
    }

    public void setImageList(String[] imageList) {
        this.imageList = imageList;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
