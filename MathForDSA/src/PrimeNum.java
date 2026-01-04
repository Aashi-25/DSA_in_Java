public class PrimeNum {
    public static void main(String[] args) {
        int n = 13;
        for(int i=2 ; i<=n ; i++){
            System.out.println("the given number," + i + " "+  isPrime(i));
        }
    }
    static boolean isPrime(int n){
        int i=2;
        while(i*i <= n){
            if(n%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
