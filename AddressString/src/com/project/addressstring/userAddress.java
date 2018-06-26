package com.project.addressstring;

import java.io.InputStreamReader;
import java.util.Scanner;

public class userAddress {
    public userInput input;

    public userAddress() {
        input = new userInput();
    }

    public void endAddress(){
        System.out.println("Please enter an Address");
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        String input = String.valueOf(scanner.nextLine());
        //System.out.println(input);
        //addressString = input.replaceAll(",", "");
        //System.out.println(addressString);
        userInput.addressString = input;
        userInput retrieve = new userInput();
        retrieve.getAddressString();
        splitAddress complete = new splitAddress();
        complete.completeAddress();
    }
}
