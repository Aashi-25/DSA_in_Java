public class LCM {
    public static void main(String[] args) {
        int a = 15;
        int b = 17;
        System.out.println(lcm(a,b));
    }
    static int lcm(int a , int b){
        return a*b / hcf(a,b);
    }
    static int hcf(int a , int b){
        if(a == 0){
            return b;
        }
        return hcf(b%a , a);
    }
}
