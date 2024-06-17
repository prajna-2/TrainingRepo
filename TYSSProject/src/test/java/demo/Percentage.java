package demo;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input initial amount
        System.out.print("Enter the initial amount: ");
        Double initialAmount = scanner.nextDouble();

        // Input percentage to subtract
        System.out.print("Enter the percentage to subtract (in decimal): ");
        double percentage = scanner.nextDouble();

        // Calculate the amount to subtract
        double amountToSubtract = initialAmount * (percentage/100);

        // Subtract the amount
        double finalAmount = initialAmount - amountToSubtract;

        System.out.println("Final Amount after Subtraction: " + finalAmount);

        scanner.close();
    }
}
