package contstdiscussion;

import java.util.ArrayList;
import java.util.Arrays;

/*
A bus travels to N different stops, and at each stop some amount of people get in and get out.
You are given an array A, where integer A[i] gives the amount of people who have got onto the bus (if positive), or the amount of people who have gotten off the bus (if negative) at the stop i.

You are also given a positive integer B, that denotes the capacity of the bus,
 that is the maximum number of people the bus can hold. The bus can hold 0 to B number of people at any time.

Initially, the bus can have some number of people inside of it,
you have to find the total number of possible ways of how many people were initially in the bus before the first stop,
such that at any time there are always 0 to B number of people in the bus.

If it is not possible to find any valid number of ways, return 0.


 */
public class BusDilema {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(2,1,-3)),5));
        System.out.println(solve(new ArrayList<>(Arrays.asList(-1,1)),4));
        System.out.println(solve(new ArrayList<>(Arrays.asList(-1,2)),10));
        System.out.println(solve(new ArrayList<>(Arrays.asList(-1000000,-1000000)),1000000000));
    }
    public static int solve(ArrayList<Integer> A, int B) {
       ArrayList<Long> prefixSum=new ArrayList<>();
       prefixSum.add(0l);
       long preFixSumMax=Long.MIN_VALUE;
       long preFixSumMin=Long.MAX_VALUE;
       for (int j = 0; j < A.size(); j++) {
            prefixSum.add(A.get(j)+prefixSum.get(j));
            preFixSumMax=Math.max(prefixSum.get(j+1),preFixSumMax);
            preFixSumMin=Math.min(preFixSumMin,prefixSum.get(j+1));
        }
        /*System.out.println("Prefix sum     is "+prefixSum);
        System.out.println("Prefix sum Max is "+preFixSumMax);
        System.out.println("Prefix sum Min is "+preFixSumMin);*/
       if(preFixSumMin<0 ){
            if (preFixSumMax>0){
                long resultTemp = B + preFixSumMin - preFixSumMax + 1;

                return (int)Math.max(resultTemp,0);
            }else{
                long resultTemp = B + preFixSumMin  +1;

                return (int)Math.max(resultTemp,0);
            }

       }
       else{
           if (preFixSumMax<0){
               return (int)Math.max(0,B+preFixSumMax+1);
           }
           return (int)Math.max(0,B-preFixSumMax+1);
       }


    }
}
