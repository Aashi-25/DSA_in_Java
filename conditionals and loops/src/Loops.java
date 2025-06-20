import java.util.Scanner;
public class Loops {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of n:-");
        int n = in.nextInt();

        //print numbers from 1 to 5
        for(int i = 1; i<=5; i++){
            System.out.println(i);
        }

        //print hello world n times
        for(int i=1; i<=n; i++){
            System.out.println("Hello World!!");
        }

        //while loop
        int num = 0;
        while(num < 4){
            System.out.println("while loop--> "+num);
            num += 1;
        }

        //do while loop -> the program or loop is going to execute atleast once
        int x = 1;
        do{
            System.out.println("Hello from do-while loop<3");
        } while (x != 1); //this code will print the print statement once
    }
}

// for loop used when you know how many times a loop would run and while loop is used incase you dont know how many times a loop is going to run
