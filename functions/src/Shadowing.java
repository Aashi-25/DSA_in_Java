//shadowing in java is a practice of using 2 variables with the same name within a scope that overlaps
//shadowing doesn't work with methods

public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x); //print 90
        int x = 40;
        System.out.println(x); //print 40 --> on printing this x the , higher level x (90) will be shadowed
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
