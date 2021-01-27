package com.company;

import java.util.ArrayList;

public class EstablishmentAdmin extends User {

    private String NIP;
    private ArrayList<Establishment> establisments = new ArrayList<>();

    public EstablishmentAdmin(String fullname, String phone, String email, String password, String image,String NIP) {
        super(fullname, phone, email, password, image);
        this.NIP = NIP;
    }

    public String getNip(){
        return this.NIP;
    }

    public void setNip(String newNIP){
        this.NIP = newNIP;
    }

    public void registerNewEstablishment(Establishment newEstablishment){
        this.establisments.add(newEstablishment);
    }

    public void AddMenu(){

    }

    public void UpdateMenu(){

    }

    public void DeleteEstablishment(){

    }

    public void EditTables(){

    }
}
