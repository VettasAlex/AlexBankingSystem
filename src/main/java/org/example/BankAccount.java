package org.example;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankAccount extends CreateAccount {
    private String accountHolderName;
    private int accountNumber;
    private String password;
    protected double balance = 0;

    public BankAccount(String accountHolderName, int accountNumber, String password){
        setAccountHolderName(accountHolderName);
        setPassword(password);
        this.accountNumber = accountNumber;
    }

    public void setPassword(String password){
        if(password.length()>=6){
            this.password = password;
        } else {
            System.out.println("Password must be longer");
        }
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

    public int getAccountNumber() {
        return accountNumber;
    }

    //TIMESTAMP
    public static String getTimestamp() {
        LocalDateTime now = LocalDateTime.now();  // Current date & time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return now.format(formatter);  // Format the timestamp
    }

}
