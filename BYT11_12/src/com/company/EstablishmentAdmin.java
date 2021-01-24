package com.company;

public class EstablishmentAdmin extends User {
private String nip;
    public EstablishmentAdmin(String fullname, String phone, String email, String password, String image,String Nip) {
        super(fullname, phone, email, password, image);
        Nip = nip;
    }

    public String getNip(){
        return nip;
    }
    public void setNip(String NIP){
        nip = NIP;
    }
    public void RegisterNewEstablishment(){

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
