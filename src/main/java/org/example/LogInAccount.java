package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LogInAccount extends BankAccount{


    public LogInAccount(String accountHolderName, int accountNumber, String password) {
        super(accountHolderName, accountNumber, password);
        }


    public void login(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your Account number");
        String inputAccountnumber = myObj.nextLine();

        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Enter your Password");
        String inputPassword = myObj.nextLine();

        boolean isAuthenticated = false;

        try (BufferedReader br = new BufferedReader(new FileReader("users.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" \\| "); // Split data based on " | "

                if (parts.length == 4) {  // Ensure valid data format
                    String storedFullName = parts[2];  // Second field is the full name
                    String storedPassword = parts[3];  // Fourth field is the password

                    if (inputAccountnumber.equals(storedFullName) && inputPassword.equals(storedPassword)) {
                        isAuthenticated = true;
                        break;  // Stop checking after finding a match
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(isAuthenticated = true){
            System.out.println("Log in Successful!");
        }else{
            System.out.println("Log In Failed, Please try again");
        }

    }


}
