import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        armstrong(a);
    }

    //print all 3 digit armstrong numbers
    static int armstrong(int n){
        int original = n;
        int sum = 0;
        while (n>0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
        if (sum == original) {
            System.out.println("the given number is an armstrong number.");
        }
        else{
            System.out.println("the given number is not an armstrong number.");
        }
        return original;
    }
}
