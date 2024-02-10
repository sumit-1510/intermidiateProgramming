package problemsonarrays;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
 *
 * and at least one occurrence of the minimum value of the array.
 */
public class ClosestMinMaxSubArray {
    public static void main(String[] args) {
        ArrayList<Integer> sampleArray = new ArrayList<>();
        sampleArray.add(1);
        sampleArray.add(3);
        sampleArray.add(7);
        sampleArray.add(1);
        sampleArray.add(4);
        sampleArray.add(1);

        System.out.println(new ClosestMinMaxSubArray().solve(sampleArray));
    }

    public int solve(ArrayList<Integer> A) {
        int min = Collections.min(A);
        int max = Collections.max(A);
        int ans=0;
        int maxIndex=-1;
        //MAx-Min
        for(int i=0;i<A.size();i++){
            if ( A.get(i) == max) {
                if (maxIndex==-1)
                    maxIndex=i;
            }
            if (A.get(i) == min) {
                if(maxIndex==-1){
                    continue;
                }
                ans=Math.max(ans,(i - maxIndex + 1)) ;
            }
        }
        maxIndex=-1;
        //Min -MAx
        for(int i=A.size()-1;i>=0;i--){
            if ( A.get(i) == max) {
                if (maxIndex==-1)
                    maxIndex=i;
            }
            if (A.get(i) == min) {
                if(maxIndex==-1){
                    continue;
                }
                ans=Math.max(ans,(maxIndex -i + 1)) ;
            }
        }
        return ans;
    }
}