package com.company;

import java.util.ArrayList;
import java.util.List;

public class Establishment {
    private String name,description,address,contacts;
    private City city;
    private String[] imagelist;
    private String workHours;
    private double rating;
    private List<Table> tables;


    public Establishment(String name,String description,String address, String contacts,City city,String[] imageList,
                         String workHours,double rating,List<Table> tables) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.contacts = contacts;
        this.imagelist = imageList;
        this.workHours = workHours;
        this.city = city;
        this.rating = rating;
        this.tables= tables;
    }

    public String getName(){
            return this.name;
    }
    public void seName(String newName){
        this.name = newName;
    }


    public void setDescription(String newDesc){
        this.description = newDesc;
    }
    public String getDescription(){
        return this.description;
    }


    public void setAddress(String newAddress){
        this.address = newAddress;
    }
    public String getAddress(){
        return this.address;
    }


    public void setContacts(String newContacts){
        this.contacts = newContacts;
    }
    public String getContacts(){
        return this.contacts;
    }


    public void setWorkHours(String newWH){
        this.workHours = newWH;
    }
    public String getWorkHours(){
        return this.workHours;
    }

    public void setRating(double newRate){
        this.rating = newRate;
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

    public String[] getImagelist() {
        return imagelist;
    }

    public void setImagelist(String[] imagelist) {
        this.imagelist = imagelist;
    }
}
