package com.company;

import java.util.List;

public class Dish {
    private String dishName;
    private String description;
    private String price;
    private List<String> ingredients;

    public Dish(String dishName, String description, String price, List<String> ingredients) {
        this.dishName = dishName;
        this.description = description;
        this.price = price;
        this.ingredients = ingredients;
    }

    public String getDishName(){
        return dishName;
    }
    public void setDishName(String dishName){
        this.dishName = dishName;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public String getPrice(){
        return price;
    }
    public void setPrice(String price){
        this.price = price;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}
