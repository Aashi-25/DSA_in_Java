import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        System.out.println(greet());
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println(myGreet(name));
    }

    static String myGreet(String name) {
            return ("Hello " + name);
    }

    static String greet() {
        String greeting = "How are you??!";
        return greeting;
    }
}
