//find the largest of the 3 numbers

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//
//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }

//        Approach-2
        int max = Math.max(c , Math.max(a , b));
        System.out.println(max);
    }
}
