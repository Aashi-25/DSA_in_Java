public class SearchInStrings {
    public static void main(String[] args) {
        char target = 'a';
        boolean ans = search("name", target);
        System.out.println(ans);
    }
    static boolean search(String str , char target){
        if (str.isEmpty()){
            return false;
        }
        for (int i=0 ; i<str.length() ; i++){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
