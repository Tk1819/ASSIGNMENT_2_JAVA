import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int lower = scanner.nextInt();
        System.out.print("Enter upper limit: ");
        int upper = scanner.nextInt();
        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are:");
        for (int num = lower; num <= upper; num++) {
            int order = String.valueOf(num).length();
            int sum = 0;
            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, order);
                temp /= 10;
            }
            if (num == sum) {
                System.out.println(num);
            }
        }
    }
}