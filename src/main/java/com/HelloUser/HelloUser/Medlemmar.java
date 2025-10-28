package com.HelloUser.HelloUser;

public class Medlemmar {

    private String Förnamn;
    private String Efternamn;
    private int Födelsedag;
    private int id;
    public Medlemmar(String förnamn, String efternamn, int födelsedag, int id) {
        this.Förnamn = förnamn;
        this.Efternamn = efternamn;
        this.Födelsedag = födelsedag;
        this.id = id;
    }
    public String getFörnamn() {
        return Förnamn;
    }
    public void setFörnamn(String förnamn) {
        Förnamn = förnamn;
    }
    public String getEfternamn() {
        return Efternamn;
    }
    public void setEfternamn(String efternamn) {
        Efternamn = efternamn;
    }
    public int getFödelsedag() {
        return Födelsedag;
    }
    public void setFödelsedag(int födelsedag) {
        Födelsedag = födelsedag;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
}
