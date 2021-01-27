package com.company;

public class Client extends User {

   private String[] cardInfo;
   private ClientStatusEnum status;

    enum ClientStatusEnum{
        regular,
        newOne
    }

    public Client(String fullname, String phone, String email, String password, String image, String[] cardInfo) {
        super(fullname, phone, email, password, image);
        this.cardInfo = cardInfo;
        status = ClientStatusEnum.newOne;

    }

    public String[] getCardInfo(){
        return this.cardInfo;
    }

    public void setCardInfo(String[] cardInfo){
      this.cardInfo = cardInfo;
    }

    public void BookTable(){

    }

    public void MakeOrder(){

    }

    public void SelectEstablishment(){

    }

    public void LeaveAReview(){

    }

    public void CalculateHowManyTimesOrdered(){

    }
}
