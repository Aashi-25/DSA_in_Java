import java.util.Scanner;

public class Switch {
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


        int day = in.nextInt();
        switch(day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}
//if break is not provided then all the executions below it (break) will execute
//duplicate cases are not allowed
