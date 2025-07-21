//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Q:- store a roll number
        int a = 19;

        //Q:- store a person's name
        String name = "AG";

        //Q:- store 5 roll numbers -> arrays can be used (arrays are a collection of a single datatype)
        // syntax :- datatype[] variable_name = new datatype[size]

        int[] rnos = new int[5];
        //or directly
        int[] rnos2 = {1,2,3,4,5}; //mixing and matching of datatypes in arrays is not possible

        int[] ros; //declaration of array..ros is getting defined in the stack
        ros = new int[5]; // initialisation of array...here object is being created in the memory(heap)
    }
}