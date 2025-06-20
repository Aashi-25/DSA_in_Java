import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int digit = in.nextInt();
        int count = 0;

        while(num > 0){
            int rem = num % 10;
            if(rem == digit){
                count ++;
            }
            num = num / 10;
        }
        System.out.println("Occurrence of " + digit + "is equal to" + count + "times");
    }
}
