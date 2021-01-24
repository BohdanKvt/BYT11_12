package com.company;

public class Table extends Establishment {
private int NUmber;
private int numberOfSeats;
private String[] status= {"blocked","avaliable"};
enum TabLoc{
    NearWindow,
    InTheWindow,
    Other
}
    private String TabLocDescription;


    public Table(String fullname, String phone, String email, String password, String image, String nip, String name, String description, String adress, String contacts, String[] imgList, int workHours, double rating,
                 int NUmber,int numberOfSeats) {
        super(fullname, phone, email, password, image, nip, name, description, adress, contacts, imgList, workHours, rating);
        NUmber = this.NUmber;
        numberOfSeats = this.numberOfSeats;
    }
    public int getNUmber(){
        return NUmber;
    }
    public void setNUmber(int nu){
        NUmber = nu;
    }

    public int getNumberOfSeats(){
        return numberOfSeats;
    }
    public void setNumberOfSeats(int nuOfSeats){
        numberOfSeats = nuOfSeats;
    }

}
