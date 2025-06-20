//package conditionals and loops
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter your salary: ");
        int sal = obj.nextInt();
        if (sal > 10000) {
            sal = sal + 1000;
            System.out.println("Your incremented salary is: " + sal);
        } else {
            sal = sal + 2000;
            System.out.println("Your incremented salary is: " + sal);
        }

        //multiple if-else statements
        if(sal > 10000){
            sal += 2000;
            System.out.println("Your incremented salary is: " +sal);
        }
        else if (sal > 20000) {
            sal += 3000;
        }
        else{
            sal += 1000;
        }
    }
}

