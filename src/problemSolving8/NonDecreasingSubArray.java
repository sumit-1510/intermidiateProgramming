package problemSolving8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
Given an array A of size N. You will be given M queries to process. Each query will be of the form B[i][0] B[i][1].

If the subarray from B[i][0] to B[i][1] is non decreasing, the output should be 1 else output should be 0.

Return an array of integers answering each query.
 */
public class NonDecreasingSubArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> input=new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(new Integer[]{0, 2})));
        input.add(new ArrayList<>(Arrays.asList(new Integer[]{3, 4})));
        input.add(new ArrayList<>(Arrays.asList(new Integer[]{0, 1})));
        input.add(new ArrayList<>(Arrays.asList(new Integer[]{2, 3})));
        input.add(new ArrayList<>(Arrays.asList(new Integer[]{0, 4})));
        System.out.println(solve(new ArrayList<>(Arrays.asList(7,7,1,6,9)),input));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        System.out.println("Original Array is "+A);
        ArrayList<Integer> temp=new ArrayList<>();
        temp.add(0);
        for(int i=1;i<A.size();i++){
            if(A.get(i)<A.get(i-1)){
                temp.add(1);
            }else
                temp.add(0);
        }
        System.out.println("tempArray is "+temp);
        ArrayList<Integer> prefixSum=new ArrayList<>();
        prefixSum.add(0);
        for (int i=0;i<temp.size();i++){
            prefixSum.add(temp.get(i)+prefixSum.get(i));
        }

        System.out.println("Prefix sum is "+prefixSum);
        ArrayList<Integer> result = new ArrayList<>();
        for (ArrayList<Integer> query : B) {
            int start = query.get(0);
            int end = query.get(1);
            int diff = prefixSum.get(end+1) - prefixSum.get(start+1);
            if (diff > 0) {
                result.add(0);
            } else {
                result.add(1);
            }
        }
        return result;
    }
}
