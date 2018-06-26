package com.project.addressstring;

import java.util.Arrays;
import java.util.List;

public class splitAddress {

    public String addressString;
    public String address;
    public String addressToSplit;
    public String city;
    public String state;
    public String zipCode;

    public void completeAddress() {
        addressString = userInput.addressString;
        //System.out.println(addressString);
        if (addressString.contains(",")) {
            String[] items = addressString.split(",", 2);
            List<String> itemList = Arrays.asList(items);
            //System.out.println(itemList.get(0));
            address = itemList.get(0);
            addressToSplit = (itemList.get(1).replaceAll(",", "").trim());
            String[] list = addressToSplit.split(" ");
            List<String> listedItems = Arrays.asList(list);
            //System.out.println("The number of items in the list is: " + list.length);
            //System.out.println(listedItems);
            if (list.length == 5) {
                city = listedItems.get(0) + " " + listedItems.get(1) + " " + listedItems.get(2);
                state = listedItems.get(3);
                zipCode = listedItems.get(4);
            } else if (list.length == 4) {
                city = listedItems.get(0) + " " + listedItems.get(1);
                state = listedItems.get(2);
                zipCode = listedItems.get(3);
            } else if (list.length == 3) {
                city = listedItems.get(0);
                state = listedItems.get(1);
                zipCode = listedItems.get(2);
            } else {
                System.out.println("The address you entered is incorrect!");
                userAddress complete = new userAddress();
                complete.endAddress();
            }

        } else {
            System.out.println("Please enter your address in the correct format!");
            userAddress complete = new userAddress();
            complete.endAddress();
        }

        //System.out.println(city);
        //System.out.println(address);
        //System.out.println(addressToSplit);
        userInput.address = address;
        userInput address = new userInput();
        address.getAddress();
        userInput.city = city;
        userInput city = new userInput();
        city.getCity();
        userInput.state = state;
        userInput state = new userInput();
        state.getState();
        userInput.zipCode = zipCode;
        userInput zipCode = new userInput();
        zipCode.getZipCode();
        //System.out.println("Complete");
    }
}
