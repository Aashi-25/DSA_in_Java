import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum(); //calling a function in main function
        System.out.println(sum3(4 , 5));
    }

    //pass the value of numbers when you are calling the method in main()
    //done using parameters
    static int sum3(int a , int b){
        int sum = a + b;
        return sum;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1:- ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2 :- ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }
}
