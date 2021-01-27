package com.company;

public abstract class User {
    private String fullname;
    private String phone;
    private String email;
    private String password;
    private String image;

    public User(String fullname, String phone, String email,String password,String image){
         this.fullname = fullname;
         this.phone = phone;
         this.email = email;
         this.password = password;
         this.image = image;
    }

    public User(String fullname, String phone, String email,String password){
        this.fullname = fullname;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public String getFullName(){
        return this.fullname;
    }
    public void SetFullName(String newName){
        this.fullname = newName;
    }

    public String getPhone(){
        return this.phone;
    }
    public void SetPhone(String newPhone){
        this.phone = newPhone;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String newEmail){
        this.email = newEmail;
    }

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String newPassword){
        this.password = newPassword;
    }

    public String getImage(){
        return this.image;
    }
    public void setImage(String newImage){
        this.image = newImage;
    }

}
