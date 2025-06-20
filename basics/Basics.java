import java.util.Scanner;
public class Basics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter an integer:");
        int num = input.nextInt();
        int a = 10;
        //conditional statement
        if (num>=a){
            System.out.println("yayyy!!");
        }

        //while loop
        int count = 1;
        while(count != 5){
            System.out.println(count);
            count++;
        }

        //for loop
        for(int i = 0 ; i<=5 ; i++ ){
            System.out.print(i );
        }
    }
}
//when you don't know how many times the loop is going to run, use the while loop otherwise for loop.