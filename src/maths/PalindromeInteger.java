package maths;

public class PalindromeInteger {
    /**
     * Determine whether an integer is a palindrome. Do this without extra space.
     *
     * A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed. Negative numbers are not palindromic.
     *
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome(1223333221));
        System.out.println(isPalindrome(1223334221));
        System.out.println(isPalindrome(1));
    }
    public static int isPalindrome(int A) {
        if(A<0) return 0;
       int original=A;
       int reverse=0;
      // 1221 -> 1-> 122-> 2 1*10+2=12
       while(original>0){
           reverse=reverse*10 + original%10;
           original=original/10;
       }
       if (A==reverse){
           return 1;
       }
       return 0;
    }

}
