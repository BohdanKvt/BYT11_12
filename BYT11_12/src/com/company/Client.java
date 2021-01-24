package com.company;

public class Client extends User {
   private String CardInfo;
   private int idClient;

    public Client(int id, String fullname, String phone, String email, String password, String image, String NIP, String CardInfo) {
        super(fullname, phone, email, password, image);
        this.CardInfo = CardInfo;
        idClient=id;

    }
    public String getCardInfo(){
        return CardInfo;
    }
    public void setCardInfo(String cardInf){
      CardInfo = cardInf;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
    public void BookTable(){

    }
    public void MakeOrder(){

    }
    public void SelectEstablishment(){

    }
    public void LeaveaReview(){

    }
    public void CalculateHowManyTimesOrdered(){

    }
}
