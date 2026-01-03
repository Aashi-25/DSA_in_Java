public class CheckKthBit {
    public static void main(String[] args) {
        int n = 17;
        int k = 4;
        System.out.println((n & (1<<k)) != 0 ? true : false);
    }
}
