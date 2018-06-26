package com.project.addressstring;


public class AddressString {


    public static void main(String[] args) {
        System.out.println("Program to split an address string");
        userAddress complete = new userAddress();
        complete.endAddress();
        displayAddress retrieve = new displayAddress();
        retrieve.showAddress();
    }
}
