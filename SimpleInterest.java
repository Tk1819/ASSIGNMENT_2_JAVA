import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double P = scanner.nextDouble();
        System.out.print("Enter the time period (in years): ");
        double T = scanner.nextDouble();
        System.out.print("Enter the rate of interest (in percentage): ");
        double R = scanner.nextDouble();
        double SI = (P * T * R) / 100;
        System.out.println("Simple Interest: " + SI);
    }
}