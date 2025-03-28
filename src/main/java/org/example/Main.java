package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        CreateAccount loginSystem = new CreateAccount();  // Create an instance of LoginSystem

        // Register with CreateAccount
        BankAccount newAccount = loginSystem.createAccount(scanner);

        if (newAccount != null) {
            accounts.add(newAccount);
        }


    }
}
