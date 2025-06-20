import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int result = 0;
        int ans = 0;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while(num>0) {
            int rem = num % 10;
            num = num / 10;

            ans = (ans*10) + rem;
        }
        System.out.println("reversed num is:" + ans);
    }
}
