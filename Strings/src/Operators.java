package src;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));
        System.out.println("a" + 1);
        //integer will be converted to integer that will call toString()
        System.out.println("Aashi" + new ArrayList<>());
        System.out.println("Aashi" + new Integer(56));
        //in above examples string added with object...object converted to string using toString method in backend

        //operator + is only defined for primitives and between (strings and other complex objects)
    }
}
