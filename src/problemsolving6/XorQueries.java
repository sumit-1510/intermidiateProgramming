package problemsolving6;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * You are given an array A (containing only 0 and 1) as element of N length.
 * Given L and R, you need to determine value of XOR of all elements from L to R (both inclusive) and number of unset bits (0's) in the given range of the array.
 */
public class XorQueries {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> input=new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(new Integer[]{2, 4})));
        input.add(new ArrayList<>(Arrays.asList(new Integer[]{1, 5})));
        input.add(new ArrayList<>(Arrays.asList(new Integer[]{3, 5})));
        System.out.println(solve(new ArrayList<>(Arrays.asList(1,0,0,0,1)),input));
    }
    public static  ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> preFixSum=new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        preFixSum.add(0);
        for (int i=0;i<A.size();i++){
            preFixSum.add(preFixSum.get(i)+A.get(i));
        }
        for (int i=0;i<B.size();i++){
            ArrayList<Integer> temp = B.get(i);
            int L = temp.get(0);
            int R = temp.get(1);
            int sum = preFixSum.get(R) - preFixSum.get(L - 1);
            int xor=sum%2;
            int unsetBits=sum-(R-L+1);
            ArrayList<Integer> result = new ArrayList<>();
            result.add(xor);
            result.add(Math.abs(unsetBits));
            ans.add(result);
        }
        return ans;

    }
}
