package ArraysAndDynamicArrays;

import java.util.*;

/**
 * Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
 */
public class GoodPair {
    public static void main(String[] args) {
        System.out.println(solve(Arrays.asList(1,2,3,4,5,6),6));
    }
    public static int solve(List<Integer> A, int B) {

        HashSet<Integer> hashSet=new HashSet<>();
        for(Integer i:A){
            if(hashSet.contains(B-i)){
                return 1;
            }
            else{
                hashSet.add(i);
            }
        }
        return 0;
    }
}
