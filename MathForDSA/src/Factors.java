public class Factors {
    public static void main(String[] args) {
        int n = 20;
        for(int i=1 ; i<=n ; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
        factor2(n); //optimised approach...takes time complex = O(sqrt(n))
    }

    static void factor2(int n){
        for(int i=1 ; i*i <= n ; i++){
            if(n%i == 0){
                if(i == n/i){
                    System.out.println(i);
                }else{
                    System.out.println(i + " , " + n/i);
                }
            }
        }
    }
}
