package src;

public class Comparison {
    public static void main(String[] args) {
        String a = "AG";
        String b = "AG";
        System.out.println(a==b);

        String name1 = new String("AG");
        String name2 = new String("AG");
        System.out.println(name1 == name2);

        //if you only wish to compare values and don't care whether the ref variable is pointing to the same object or not -> use equals() method
        System.out.println(name1.equals(name2));
     }
}
