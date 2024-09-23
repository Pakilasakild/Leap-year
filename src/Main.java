import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int N = sc.nextInt();
        if (N % 400 == 0) {
            System.out.println(N + " is a leap year");
        }
        else if (N % 4 == 0 && N % 100 != 0) {
            System.out.println(N + " is a leap year");
        }
        else if (N % 100 == 0) {
            System.out.println(N + " is not a leap year");
        }
    }
}