import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ques -> taake input of 2 numbers and print the sum
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number:- ");
        int num1 = in.nextInt();
        System.out.println("Enter second number:- ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is equal to " + sum);
    }
}