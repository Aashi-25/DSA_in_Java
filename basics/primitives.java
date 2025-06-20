import java.sql.SQLOutput;
import java.util.Scanner;

public class primitives {
    public static void main(String[] args) {
        int rollno = 67; //primitive datatype - those datatypes that cannot be broken further
        //string is not primitive datatype
        char letter = 'a';
        float marks = 45.78f;
        //all decimal values by default are double so to store them in float an 'f' is added after the floating pt no
        double largedecimalnumbers = 433624835.54384321;
        long largeInteger = 236475432;
        boolean check = false;

        //integer class
        Integer rno = 64;

        //to print 23,00,000...type underscore instead of comma
        int x = 23_00_000;
    }
}

class Inputs{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter some input:-");
//        int rollno = input.nextInt();
//        System.out.println("Your roll no is " +rollno);
//
//        int a = 34_00_000;
//        System.out.println(a);

        String name = input.nextLine();
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);
    }
}