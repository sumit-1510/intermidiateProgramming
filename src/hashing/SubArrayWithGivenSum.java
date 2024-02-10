package hashing;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.
 *
 * If the answer does not exist return an array with a single integer "-1".
 *
 * First sub-array means the sub-array for which starting index in minimum.
 */
public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,3,4,5)); // sample input array
        int B = 9; // sample sum
        ArrayList<Integer> result = solve(A, B);
        System.out.println(result);
    }

    public static  ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        //create prefix sum array of A
        ArrayList<Long> preFixSum=new ArrayList<>();
        preFixSum.add(0l);
        for (int i = 0; i < A.size(); i++) {
            preFixSum.add(preFixSum.get(i) + A.get(i));
        }
        //1 2 3 4 5
       // System.out.println("Prefix sum is "+preFixSum);
        HashMap<Long,Integer> hashMap=new HashMap<>();
        //PS[LR]=PS[R]-PS[L-1]
        //K=PS[R]-PS[L-1]
        //PS[L-1]=PS[R]-K
        int firstIndex=-1;
        int lastIndex=-1;
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0;i<preFixSum.size();i++){
            Long l1 = preFixSum.get(i) - B;
            if(hashMap.containsKey(l1)){

                firstIndex=hashMap.get(l1);
                lastIndex=i-1;
                break;
            }
            else{
                hashMap.putIfAbsent(preFixSum.get(i),i);
            }
        }
        if(firstIndex!=-1 &&lastIndex!=-1){
            for(int k=firstIndex;k<=lastIndex;k++){
                result.add(A.get(k));
            }
        }
        else{
            result.add(-1);
        }
        return result;

    }
}