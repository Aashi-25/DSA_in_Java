public class SetBits {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(Integer.toBinaryString(n)); //to print the binary representation of the number
        System.out.println(FindSetBits(n));
    }
    static int FindSetBits(int n ){
        int count = 0;
//        while(n > 0){
//            if((n & 1) == 1){
//                count ++;
//            }
//            n = n>>1;
//        }
//        return count;

        //method 2
        while(n > 0){
            count ++;
            n = n & (n-1);
        }
        return count;
    }
}
