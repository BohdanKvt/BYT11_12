package com.company;

import java.util.ArrayList;

public class EstablishmentAdmin extends User {

    private String NIP;
    private final ArrayList<Establishment> establishments;

    public EstablishmentAdmin(String fullname, String phone, String email, String password, String image, String NIP) {
        super(fullname, phone, email, password, image);
        this.NIP = NIP;
        this.establishments = new ArrayList<>();
    }

    public String getNip() {
        return this.NIP;
    }

    public void setNip(String NIP) {
        this.NIP = NIP;
    }

    public void registerNewEstablishment(Establishment establishments) {
        this.establishments.add(establishments);
    }

    public void AddMenu() {

    }

    public void UpdateMenu() {

    }

    public void DeleteEstablishment() {

    }

    public void EditTables() {

    }
}
