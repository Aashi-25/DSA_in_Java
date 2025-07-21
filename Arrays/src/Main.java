
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

        System.out.println(ros[1]); //prints 0 as no value assigned

        String[] arr = new String[5];
        System.out.println(arr[0]); //prints null.. null is a type of special literal
    }
}

// Important pointers:-
// in java , array objects are in heap (not just array but all objects)
// we know, heap objects are not continuous in java
// Dynamic Memory Allocation at runtime
// Hence, array objects in java , may not be continuous
// NEW keyword :- it is used to create an object
// primitive objects are stored in stack memory