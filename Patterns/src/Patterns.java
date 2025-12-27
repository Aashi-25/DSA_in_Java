//*
//**
//***
//****
//*****

public class Patterns {
    public static void main(String[] args) {
        Pattern1(4);
        System.out.println();
        Pattern2(4);
        System.out.println();
        Pattern3(4);
        System.out.println();
        Pattern4(5);
        System.out.println();
        Pattern5(5);

    }
    static void Pattern1(int n){
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Pattern2(int n){
        for(int i=1 ; i<=n ; i++){
            int j=4;
            while(j>0) {
                System.out.print("*");
                j--;
            }
            System.out.println();
        }
    }
    static void Pattern3(int n){
        for(int i=n ; i>0 ; i--){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern4(int n){
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //important
    static void Pattern5(int n){
        for(int i=1 ; i<2*n ; i++){
            int totalColsInRow = i<=n ? i : 2*n-i;
            for(int j=1 ; j<=totalColsInRow ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
