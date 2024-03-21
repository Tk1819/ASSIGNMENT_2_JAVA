import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in rupees: ");
        double rupees = scanner.nextDouble();
        double usd = rupees / 75;
        System.out.println("Amount in USD: " + usd);
    }
}