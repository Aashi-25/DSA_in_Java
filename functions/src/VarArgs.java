import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,67,53,24); //any number of arguments can be passed in variable length arguments
        fun(); //empty array

        multiple(2 , 3 , "hi" , "bye" , "tata");
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    } // ...v -> this is internally taking an array of the specified datatype here , integers

    //when you wish to have a mix of arguments of different datatypes
    static void multiple(int a, int b, String ...v){
        System.out.println();
    }
}
