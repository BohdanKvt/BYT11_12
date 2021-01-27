package com.company;

import java.util.List;

public class Dish {
    private String dishName;
    private String descriptionE;
    private String price;
    private List<String> ingredients;

    public Dish(String dishName, String descriptionE,String price,List<String> ingredients) {

        this.dishName = dishName;
        this.descriptionE = descriptionE;
        this.price = price;
        this.ingredients=ingredients;
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

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}
