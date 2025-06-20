import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner y = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = y.nextInt();
        System.out.print("Enter first number:");
        int num2 = y.nextInt();

        int sum = num1 + num2;
        System.out.print("The required sum is:" + sum);
    }
}
