import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        String a = "Aashi";
        String b = "Aashi";
        System.out.println(a == b); //equal quals to( == ) check the value as well as the reference of the value..both have to be the same

        if (fruit.equals("mango")){
            System.out.println("King of Fruit");
        }
        if(fruit.equals("Apple")){
            System.out.println("keeps the doctor away");
        }
        // very clustered syntax

        //applying same through switch cases
        String f = in.next();
        switch (f) {
            case "Mango" :
                System.out.println("King of fruits");
                break;
            case "Apple" :
                System.out.println("A swwt red fruit");
                break;
            case "Orange" :
                System.out.println("Round fruit");
                break;
            default :
                System.out.println("Please enter a valid fruit!");
        }
    }
}
//if break is not provided then all the executions below it (break) will execute