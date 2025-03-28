package org.example;
import java.io.FileWriter;
import java.io.IOException;

public class Users {

    // Method to save NEW user credentials to .txt
    public static void saveUserToFile(String accountType, String fullName, int accountNumber, String password) {
        try {
            // append to users.txt
            FileWriter fileWriter = new FileWriter("users.txt", true);

            fileWriter.write(accountType + " | " + fullName + " | " + accountNumber + " | " + password + "\n");
            fileWriter.close();  // Always close the file after writing
            System.out.println("User credentials saved successfully!");

            // prevents input/output exception
        } catch (IOException e) {
            System.out.println("An I/O exception detected.");
            e.printStackTrace();
        }
    }


}

