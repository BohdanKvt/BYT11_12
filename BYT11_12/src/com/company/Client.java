package com.company;

public class Client extends User {
   private String CardInfo;
    public Client(String fullname, String phone, String email, String password, String image,String NIP,String CardInfo) {
        super(fullname, phone, email, password, image);
        CardInfo = this.CardInfo;

    }
    public String getCardInfo(){
        return CardInfo;
    }
    public void setCardInfo(String cardInf){
      CardInfo = cardInf;
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
