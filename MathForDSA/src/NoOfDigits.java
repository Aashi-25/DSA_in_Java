//count number of digits in base b of that representation
public class NoOfDigits {
    public static void main(String[] args) {
        int n = 345678;
        int b = 2;
        int digits = (int)((Math.log(n) / Math.log(b)) + 1);
        System.out.println(digits);
        System.out.println("no of digits using right shift operator ---> " + n + ":- " + find(n));
    }
    // method 2 using right shift operator
    static int find(int n){
        int count = 0;
        while (n>0){
            count ++;
            n = n>>1;
        }
        return count;
    }
}
