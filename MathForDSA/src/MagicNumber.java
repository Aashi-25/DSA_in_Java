public class MagicNumber {
    public static void main(String[] args) {
        int n = 3;
        int magic = 0;
        int base = 5;
        while(n > 0){
            int last = n & 1;
            magic += last*base;
            n = n>>1;
            base *= 5;
        }
        System.out.println(magic);
    }
}
