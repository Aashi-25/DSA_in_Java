public class scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Aashi";
        {
//            int a = 78; already initialised outside the block in the same method, so cannot be initialised again
            a = 100; //but value can be changed
            int c = 99;
            // values initialised in this block will remain in block , cannot be used outside the block
            name = "Rahul";
            System.out.println(name);
        }

        //scoping in for loop
        for (int i = 0 ; i<4 ; i++){
            System.out.println(i);
            int num = 98;
            a = 10;
        }
//        System.out.println(i); INVALID

    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);

    }
}
