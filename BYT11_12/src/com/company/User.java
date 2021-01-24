package com.company;

import java.math.BigDecimal;

public class User {
    private String fullname;
    private String phone;
    private String email;
    private String password;
    private String image;

    public User(String fullname, String phone, String email,String password,String image){
         fullname  = this.fullname;
         phone = this.phone;
         email = this.email;
         password = this.password;
         image  = this.image;
    }
    ////////////////////////////////////////////////////
    public String getFullName(){
        return fullname;
    }
    public void SetFullName(String Name){
        fullname = Name;
    }
    ////////////////////////////////////////////////////
    public String getPhone(){
        return phone;
    }
    public void SetPhone(String Phone){
       phone = Phone;
    }
    ////////////////////////////////////////////////////
    public String getEmail(){
        return email;
    }
    public void setEmail(String Email){
        email = Email;
    }
    ////////////////////////////////////////////////////
    public String getPassword(){
        return password;
    }
    public void setPassword(String Password){
        password = Password;
    }
    ////////////////////////////////////////////////////

    public String getImage(){
        return image;
    }
    public void setImage(String Image){
        image = Image;
    }

}
