# Alex's Banking System

This is a simple **Bank Account Management System** written in Java. It allows users to create accounts, deposit, withdraw, and manage their balances with basic validation.

## Features
- Create a **Normal Account** or a **Savings Account**.
- Unique account number generation.
- Deposit and withdrawal functionality.
- **Overdraft** support for normal accounts (up to $500 limit).
- Minimum balance enforcement for savings accounts ($100 required).
- User credentials stored in a `users.txt` file.
- **Timestamps** for transactions.

## File Structure
```
├── src
│   ├── org.example
│   │   ├── Main.java            # Entry point of the program
│   │   ├── BankAccount.java     # Base class for accounts
│   │   ├── Account.java         # Normal bank account
│   │   ├── SavingsAccount.java  # Savings account with withdrawal limits
│   │   ├── CreateAccount.java   # Handles account creation
│   │   ├── Users.java           # Manages saving user data to a file
│   ├── users.txt                # Stores user account details (generated at runtime)
```

## Installation & Running
1. **Clone the repository**
   ```sh
   git clone https://github.com/yourusername/bank-account-system.git
   cd bank-account-system
   ```
2. **Compile & Run**
   ```sh
   javac -d bin src/org/example/*.java
   java -cp bin org.example.Main
   ```
3. **Follow the on-screen instructions** to create an account and make transactions.

## Example Usage
```
Enter your full name: John Doe
Create a password (min 6 characters): ********
Would you like a normal account or a savings account?
Press [1] for normal account
Press [2] for savings account
```

## To-Do (Future Enhancements)
- Implement a login system with authentication.
- Add an interest calculation for savings accounts.


## License
This project is open-source under the **MIT License**.

