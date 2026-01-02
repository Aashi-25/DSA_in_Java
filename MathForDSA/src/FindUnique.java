public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2 , 3  , 4 ,3 , 2 , 4 , 6};
        System.out.println(FindUnique(arr));
    }
    static int FindUnique(int[] arr){
        int unique = 0;
        for(int n:arr){
            unique ^= n;
        }
        return unique;
    }
}
