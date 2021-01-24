package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menu {
    private List<Dish> mydishes;
    private LocalDateTime lastUpdate;

    public Menu(List<Dish> mydishes) {
        this.mydishes = mydishes;
        lastUpdate=LocalDateTime.now();
    }

    public List<Dish> getMydishes() {
        return mydishes;
    }

    public void setMydishes(List<Dish> mydishes) {
        this.mydishes = mydishes;
        lastUpdate=LocalDateTime.now();
    }
}
