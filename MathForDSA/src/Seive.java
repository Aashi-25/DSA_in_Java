public class Seive {
    public static void main(String[] args) {
        int n = 10;
        boolean[] arr = new boolean[n+1];
        seive(arr , n);
    }
    //false in array means number is prime..be default in empty array for boolean type..all elements are false
    static void seive(boolean[] arr , int n){
        for(int i=2 ; i*i <= n ; i++){
            if(arr[i] == false){
                for(int j=i*2 ; j<=n ; j+=i){
                    arr[j] = true;
                }
            }
        }
        for(int i=2 ; i<=n ; i++){
            if(!arr[i]){
                System.out.println(i + " ");
            }
        }
    }
}
