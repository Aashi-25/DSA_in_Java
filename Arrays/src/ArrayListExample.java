import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10); //not necessary to specify initial capacity
        list.add(234);
        list.add(56);
        list.add(2);
        list.add(589);
        System.out.println(list.contains(654));
        list.set(0 , 99);
        System.out.println(list);

        //input
        for (int i = 0 ; i < 5 ; i++){
            list.add(in.nextInt());
        }
        System.out.println(list);
    }
}
