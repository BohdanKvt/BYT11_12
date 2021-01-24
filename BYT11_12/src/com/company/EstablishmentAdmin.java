package com.company;

public class EstablishmentAdmin extends User {
    private int adminId;
    private String nip;
    private Establishment myestablishment;
    public EstablishmentAdmin(int id,String fullname, String phone, String email, String password, String image,String Nip,Establishment myestablishment) {
        super(fullname, phone, email, password, image);
        Nip = nip;
        this.myestablishment=myestablishment;
        adminId=id;
    }

    public String getNip(){
        return nip;
    }
    public void setNip(String NIP){
        nip = NIP;
    }
    public void RegisterNewEstablishment(){

    }
    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
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
