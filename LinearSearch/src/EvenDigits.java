//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums =  {112,345,2,6,17896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int ans = 0;
        for (int num : nums){
            if (even(num)) {
                ans ++;
            }
        }

        return ans;
    }

    //function to check whether a number contains even digits or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    //count number of digits in a number
    static int digits(int num) {
        int count = 0;

        while (num > 0) {
            count ++;
            num = num / 10; //num /= 10
        }

        return count;
    }
}
