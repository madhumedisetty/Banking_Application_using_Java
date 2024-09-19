# Banking_Application_using_Java

## Overview

The Banking System is a simple Java application that simulates basic banking operations such as checking balance, withdrawing money, and depositing money. This project showcases fundamental programming concepts, including user authentication and basic data management.

## Key Features

- **User Authentication**: Customers can log in using their unique customer ID and password.
- **Account Management**: Customers can check their account balance, withdraw funds, and deposit money.

## Concepts Covered

### 1. Data Management
- **Static Arrays**: The application uses static arrays to store customer names, balances, passwords, and IDs. This approach allows for simple data retrieval and management.

### 2. User Authentication
- The application validates user credentials by checking the provided customer ID and password against stored values.

### 3. Control Flow
- The program utilizes loops and conditional statements to navigate user choices and perform corresponding banking operations.

### 4. Input Handling
- User input is collected using the `Scanner` class, allowing interaction with the application through the console.

## Project Structure

- **Banking Package**: Contains the main class `Banking` which handles user interactions and banking operations.

### Class Breakdown

- `Banking`: Contains the main method and logic for user authentication and banking operations.
  - **Static Arrays**:
    - `customerNames`: Stores names of customers.
    - `customerBalances`: Stores corresponding balances.
    - `passwords`: Stores passwords for authentication.
    - `customerIds`: Stores unique IDs for customers.
  - **Methods**:
    - `isIdValid(int customerId)`: Checks if the provided customer ID exists.
    - `getCustomerIndex(int customerId)`: Retrieves the index of the customer based on the ID.

## How to Run the Project

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/BankingSystem.git
   cd BankingSystem
   ```

2. **Compile the Java File**:
   Ensure you have Java Development Kit (JDK) installed. Compile the Java file using:
   ```bash
   javac Banking/*.java
   ```

3. **Run the Application**:
   Execute the main class:
   ```bash
   java Banking.Banking
   ```

4. **Follow the On-Screen Instructions**: Interact with the application through the console to log in and perform banking operations.

## Conclusion

This project serves as a practical demonstration of basic banking functionalities implemented in Java. It highlights the importance of user authentication, data management, and control flow in building interactive applications.

