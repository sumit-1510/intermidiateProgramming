package sortingintro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.
 */
public class NobelInteger {

    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(-4,-2,0,-1,-6))));
    }
    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        //-6,-4,-2,-1,0
        for (int i = 0; i < A.size()-1; i++) {
            if (A.get(i) == A.get(i+1)) {
                continue;
            }
            else{
                // 1 2 3 3
             if(A.get(i) == A.size()-i -1){
                 return 1;
             } //4-1=3
            }
        }
        if(A.get(A.size()-1)==0){
            return 1;
        }
        return -1;
    }
}
