public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 36;
        int p = 3; //p stands for precision, incase of not complete sqrts, sqrts which are in decimals...p stands for representing until which decimal place we need the ans
        System.out.printf("%.3f" , sqrt(n , p));
    }
    static double sqrt(int n , int p){
        int s = 0;
        int e = n;
        while(s<e){
            int m = s + (e-s)/2;
            if(m*m == n){
                return m;
            }else if(m*m > n){
                e = m-1;
            }else{
                s=m+1;
            }
        }
        double root = 0.0;
        double incr = 0.1;
        for(int i=0 ; i<p ; i++){
            while(root*root <= n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
