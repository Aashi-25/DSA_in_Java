public class OddEven {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(check(n));
    }
    static boolean check (int n){
        if((n & 1) == 1){
            return false;
        }
        return true;
    }
}
