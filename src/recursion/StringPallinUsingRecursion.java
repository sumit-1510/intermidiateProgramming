package recursion;

public class StringPallinUsingRecursion {

    public static void main(String[] args) {
       // System.out.println("hello".substring(1,4));
        System.out.println(isPalinDrome("PPPNITINPPP"));
    }

    public static boolean isPalinDrome(String str){
        //break Condition
        if (str.length() <= 1) {
            return true;
        }
        // equation
        if(str.charAt(0) == str.charAt(str.length()-1)){
            return isPalinDrome(str.substring(1,str.length()-1));
        }
        else{
            return false;
        }

    }
}
