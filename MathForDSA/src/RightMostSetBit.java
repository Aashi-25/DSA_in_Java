public class RightMostSetBit {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(find(n));
    }
    static int find(int n){
        int ans = (int) ((Math.log(n & -n)/Math.log(2)) + 1);
        return ans;
    }
}
