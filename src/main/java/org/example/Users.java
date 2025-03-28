package org.example;
import java.io.FileWriter;
import java.io.IOException;

public class Users {

    // Method to save user credentials to a text file
    public static void saveUserToFile(String fullName, int accountNumber, String password) {
        try {
            // append to users.txt
            FileWriter fileWriter = new FileWriter("users.txt", true);

            fileWriter.write(fullName + " | " + accountNumber + " | " + password + "\n");
            fileWriter.close();  // Always close the file after writing
            System.out.println("User credentials saved successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the user.");
            e.printStackTrace();
        }
    }

    // Optional: Method to read and print all users from the file (for debugging purposes)
    public static void readUsersFromFile() {
        // Implement file reading logic if needed for debugging or verification.
    }
}
