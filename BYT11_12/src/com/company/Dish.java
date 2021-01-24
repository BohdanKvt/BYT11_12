package com.company;

public class Dish extends Establishment {
    private String dishName;
    private String descriptionE;
    private String price;

    public Dish(String fullname, String phone, String email, String password, String image, String nip, String name, String description, String adress, String contacts,
                String[] imgList, int workHours, double rating,
                String dishName, String descriptionE,String price) {
        super(fullname, phone, email, password, image, nip, name, description, adress, contacts, imgList, workHours, rating);
        dishName = this.dishName;
        descriptionE = this.descriptionE;
        price = this.price;
    }

    public String getDishName(){
        return dishName;
    }
    public void setDishName(String Dname){
        dishName = Dname;
    }

    public String getDescriptionE(){
        return descriptionE;
    }
    public void setDescriptionE(String Desc){
        descriptionE = Desc;
    }

    public String getPrice(){
        return price;
    }
    public void setPrice(String Pr){
        price = Pr;
    }
    }
