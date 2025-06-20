import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // take input from user until user does not press X or x
        int ans = 0;
        while (true) {
            System.out.println("Enter the operator:- ");
            char op = in.next().trim().charAt(0); //var storing operator
            System.out.println();
            if(op == '+' || op == '-' || op == '/' || op == '%' || op == '*') {
                System.out.println("Enter two numbers:- ");
                //input two numbers
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println();

                if(op == '+'){
                    ans = num1 + num2;
                }

                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '/'){
                    if(num2 != 0){
                        ans = num1 / num2;
                    } else{
                        System.out.println("Division by 0 is undefined");
                    }
                }
                if(op == '%'){
                    ans = num1 % num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
            } else if(op == 'x' || op == 'X') {
                break;
            } else{
                System.out.println("Invalid Operation!!!");
            }
            System.out.println(ans);

        }
    }
}
