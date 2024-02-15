package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(13));
    }
    public static int fibonacci(int n) {
       //break Condition

        if(n<=1){return 0;}
        if(n==2){return 1;}
        //equation

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
