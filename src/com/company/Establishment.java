package com.company;

import java.util.ArrayList;
import java.util.List;

public class Establishment {
    private String name, description, adress, contacts;
    private String[] imagelist;
    private int workHours;
    private double rating;
    private List<Table> ourtables;


    public Establishment(String name,String description,String adress, String contacts,String[]imgList,
                         int workHours,double rating,List<Table> ourtables) {
        this.name = name;
        this.description = description;
        this.adress = adress;
        this.contacts = contacts;
        this.imagelist = imgList;
        this.workHours = workHours;
        this.rating = rating;
        this.ourtables=ourtables;
    }

    public String getE_Name(){
            return name;
    }
    public void setE_Name(String Name){
        name = Name;
    }


    public void setDescription(String Desc){
        description = Desc;
    }
    public String getDescription(){
        return description;
    }


    public void setAdress(String addr){
        adress = addr;
    }
    public String getAdress(){
        return adress;
    }


    public void setContacts(String Contacts){
        contacts = Contacts;
    }
    public String getContacts(){
        return contacts;
    }


    public void setWorkHours(int wh){
        workHours = wh;
    }
    public int getWorkHours(){
        return workHours;
    }

    public void setRating(double rat){
        rating = rat;
    }

    public double getRating(){
        return rating;
    }

    public List<Table> getOurtables() {
        return ourtables;
    }

    public void setOurtables(List<Table> ourtables) {
        this.ourtables = ourtables;
    }

}
