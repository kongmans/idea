package com.kong;
import java.util.Scanner;

public class shouying {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter the price of the item (0 to finish): ");
            double price = scanner.nextDouble();
            if (price == 0) {
                break;
            }
            total += price;
        }
        System.out.println("Total: $" + total);
    }
}
