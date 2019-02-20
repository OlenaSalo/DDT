package com.epam.TA.unit;

public class User {
    private String userName;
    private String psw;

    public User(){}
    public User(String userName, String psw)
    {
        this.userName = userName;
        this.psw = psw;
    }
    public void setUserName(String name){ this.userName=name;}

    public String getUserName(){return userName;}

    public void setPsw(String soil){this.psw=psw;}

    public String getPsw(){return psw;}

}
