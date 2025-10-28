package com.HelloUser.HelloUser;

public class Medlemmar {

    private String Firstname;
    private String Lastname;
    private String Birthdate;  
    private String Email;
    private int id;

    
    public Medlemmar() {
    }

    
    public Medlemmar(String firstname, String lastname, String birthdate, String email, int id) {
        this.Firstname = firstname;
        this.Lastname = lastname;
        this.Birthdate = birthdate;
        this.Email = email;
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(String birthdate) {
        Birthdate = birthdate;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}

    
