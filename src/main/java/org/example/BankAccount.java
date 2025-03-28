package org.example;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    protected double balance = 0;

    //TIMESTAMP
    public static String getTimestamp() {
        LocalDateTime now = LocalDateTime.now();  // Current date & time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return now.format(formatter);  // Format the timestamp
    }

    public void setAccountHolderName(String accountHolderName) {
        String[] words = accountHolderName.trim().split("\\s+"); // Fast way for trimming spaces

        if (words.length >= 2) {
            this.accountHolderName = accountHolderName;
        } else {
            System.out.println("Invalid name!");
        }
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.matches("\\d{8}")) { // Fast way for setting min-max digits
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Invalid account number! Must be exactly 8 digits.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }


}
