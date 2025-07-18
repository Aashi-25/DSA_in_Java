public class Overloading {
    public static void main(String[] args) {
        fun (45);
        fun (56 , 43);

    }
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(int b , int c){
        System.out.println(b);
    }
}

//method overloading -> functions of the same name but different parameters
//either the number of arguments are different or type of args are different