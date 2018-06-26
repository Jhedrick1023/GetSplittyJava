package com.project.addressstring;

public class displayAddress {
    public static String address;
    public static String city;
    public static String state;
    public static String zipCode;

    public void showAddress(){
        address = userInput.address;
        city = userInput.city;
        state = userInput.state;
        zipCode = userInput.zipCode;
        System.out.println(address + " " + city + " " + state + " " + zipCode);
    }
}
