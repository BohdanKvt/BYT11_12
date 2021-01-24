package com.company;

import java.util.ArrayList;
import java.util.List;

public class Establishment extends EstablishmentAdmin{
    private String name,description,adress,contacts;
    private String[] imagelist;
    private int workHours;
    private double rating;

    public Establishment(String fullname, String phone, String email, String password, String image,String nip,
                         String name,String description,String adress, String contacts,String[]imgList,
                         int workHours,double rating) {
        super(fullname, phone, email, password, image,nip);
        name = this.name;
        description = this.description;
        adress = this.adress;
        contacts = this.contacts;
        imgList = this.imagelist;
        workHours = this.workHours;
        rating = this.rating;
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
}
