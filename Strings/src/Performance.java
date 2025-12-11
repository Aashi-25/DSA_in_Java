package src;

public class Performance {
    public static void main(String[] args) {
        //printing chaacters
        String series = "";
        for (int i=0 ; i<26 ; i++){
            char ch = (char)('a' + i);
            System.out.println(ch);

            series = series + ch;
            System.out.println(series);
        }
    }
}
