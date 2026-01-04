public class PascalsTriangle {
    public static void main(String[] args) {
        //wap to print the element at given row and col of pascal's triangle
        int r= 5;
        int c = 3;
        System.out.println(value(r , c));
    }
    static long value(int r, int c){
        r = r-1;
        c = c-1;
        long res = 1;
        for(int i=0 ; i<c ; i++){
            res *= r-i;
            res /= i+1;
        }
        return res;
    }
}
