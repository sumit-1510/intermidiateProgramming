package problemsolving6;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * You are given an array of integers A of size N.
 *
 * The value of a subarray is defined as BITWISE OR of all elements in it.
 *
 * Return the sum of value of all subarrays of A % 109 + 7.
 */
public class SubArrayOr {
    public static void main(String[] args) {

        System.out.println((int)Math.pow(2,31));
       // System.out.println(solve(new ArrayList<>(Arrays.asList(7,8,9,10))));
    }

    public static int solve(ArrayList<Integer> A) {
        long sum=0;
        int totalSubArrays=(A.size()*(A.size()+1))/2;
        int tempj=totalSubArrays;
        for (int j = 0; j < 32; j++) {
            int contZero=0;
            for (int i = 0; i < A.size(); i++) {


                if ((A.get(i) & (1 << j)) != 0) {
                    tempj=tempj-((contZero*(contZero+1))/2);
                    contZero=0;
                }
                else{
                    contZero++;
                   // sum = (sum + (contZero * (contZero + 1) / 2) * (1 << j)) % 1000000007;
                }

            }
            tempj=tempj-((contZero*(contZero+1))/2);
            contZero=0;
            //int pow = (int)Math.pow(2, j);
            sum= (long) ((sum%1000000007 + (tempj* Math.pow(2, j))%1000000007)%1000000007);
            tempj=totalSubArrays;
        }

        return (int)sum;
    }
}

