import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        int x = input.nextInt(); //if yoy are asking for integer and giving float..it will not work as source type is smaller than destination type but in above line it will work cuz it satisfies the mentioned condition.
        System.out.println(num);

        //typecasting:- explicitely converting one datatype to another
        int z = (int)(67.89f);

        //automatic type promotion in expressions
        int y = 456;
        byte b = (byte)(y); // max size of byte variable is 256
                            // in this case it will return..456 % 256 as output

        byte m = 40;
        byte n = 50;
        byte o = 100;
        int d = (m * n)/o;
        System.out.println(d);
        System.out.println(b);

        // in this case when two byte inputs( m and n) are multiplied, they exceed the byte size (i.e. 2000) but still the compiler gives no error as when the operation is being performed, these variables have been promoted to integer type automatically

        int number = 'A';
        System.out.println(number); //output = 65..ASCII value

        // type promotion rules:
        // 1)All the byte,short and character values are promoted     to integers
        // 2)If any one of the operands is long then the whole        operation will be promoted to long (to higher            precedence datatype)

        byte h= 42;
        char j= 'a';
        short i= 1024;
        int k= 50000;
        float f= 5.67f;
        double q= 0.1234;
        double result= (f * h) + (k / j) - (q - i);
        //float + int - double = double
        System.out.println((f * h) + " " + (k / j) + " " + (q - i));
        System.out.println(result);
    }
}
