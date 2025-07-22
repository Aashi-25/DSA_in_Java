import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10); //not necessary to specify initial capacity
        list.add(234);
        list.add(56);
        list.add(2);
        list.add(589);
        System.out.println(list);
    }
}
