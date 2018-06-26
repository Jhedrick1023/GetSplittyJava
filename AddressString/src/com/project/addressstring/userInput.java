package com.project.addressstring;

public class userInput {
    public static String addressString;
    public static String address;
    public static String city;
    public static String state;
    public static String zipCode;

    //define getter

    //define setter

    public userInput() {

    }

    public String getAddressString(){
        //System.out.println(addressString);
        return addressString;
    }

    public void setAddressString(String addressString){
        this.addressString = addressString;
    }

    public String getAddress() {
        //System.out.println(address);
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getCity(){
        //System.out.println(city);
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getState(){
        //System.out.println(state);
        return state;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getZipCode(){
        //System.out.println(zipCode);
        return zipCode;
    }

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }
}