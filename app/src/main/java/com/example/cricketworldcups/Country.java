package com.example.cricketworldcups;

public class Country {
    private int imgAddress;
    private String CountryName;
    private int NumberOfWorldCups;

    Country(int imgAddress,String CountryName, int NumberOfWorldCups){
        this.imgAddress=imgAddress;
        this.CountryName=CountryName;
        this.NumberOfWorldCups=NumberOfWorldCups;
    }
    public int getImgAddress(){ return imgAddress;}
    public String getCountryName() { return CountryName;}
    public int getNumberOfWorldCups() { return NumberOfWorldCups;}
}
