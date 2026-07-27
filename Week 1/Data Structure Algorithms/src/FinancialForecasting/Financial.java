package FinancialForecasting;
import java.util.Scanner;
public class Financial {
    static double predictValue(double amount, double rate, int years) {
        if (years == 0) {
            return amount;
        }
        return predictValue(amount, rate, years - 1) * (1 + rate);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter present value: ");
        double amount = sc.nextDouble();
        System.out.print("Enter growth rate (%): ");
        double rate = sc.nextDouble() / 100;
        System.out.print("Enter number of years: ");
        int years = sc.nextInt();
        double future = predictValue(amount, rate, years);
        System.out.printf("Future value after %d years = %.2f", years, future);
        sc.close();
    }
}