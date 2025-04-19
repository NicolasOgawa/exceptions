package application;

import model.entities.Account;
import model.entities.exceptions.AccountExceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int num = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial Balance: ");
            double balance = sc.nextDouble();
            System.out.print("Whitdraw limit: ");
            double whitdrawLimit = sc.nextDouble();
            Account account = new Account(num, holder, balance, whitdrawLimit);

            System.out.print("Enter amount for withdraw: ");
            double whitdrawRequested = sc.nextDouble();

            account.Withdraw(whitdrawRequested);
            System.out.println(account);
        }
        catch (AccountExceptions e) {
            System.out.println("Error whitdraw: " + e.getMessage());
        }
        sc.close();
    }
}