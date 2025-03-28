package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        CreateAccount createAccount = new CreateAccount();  //

        // Register with CreateAccount
        BankAccount newAccount = createAccount.createAccount(scanner);

        if (newAccount != null) {
            accounts.add(newAccount);
        }

    }
}
