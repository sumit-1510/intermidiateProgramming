package hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class SubArrayWithSumZero {
    public static void main(String[] args) {

    }
    public static int solve(ArrayList<Integer> A) {
        ArrayList<Long> prefixSum=new ArrayList<>();
        prefixSum.add(0l);
        for(int i=0;i<A.size();i++){
            prefixSum.add(prefixSum.get(i) + A.get(i));
        }

     //   System.out.println("Prefix sum is "+prefixSum);

        HashSet<Long> set = new HashSet<>();
        for (int i = 0; i < prefixSum.size(); i++) {
            if (set.contains(prefixSum.get(i))) {
                return 1;
            }
            set.add(prefixSum.get(i));
        }
        return 0;
    }
}
