package ArraysAndDynamicArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddEvenSubSequences {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 2, 5, 6, 6, 7,7,7,7,7);
        int result = solve(new ArrayList<>(integers));
        System.out.println(result);
    }

    public static int solve(ArrayList<Integer> A) {

        int x=1; int y=0;
        int ans1=0;int ans2=0;

        for (int i = 0; i < A.size(); i++) {
            int it=(1&A.get(i));
            if(it==x){
                ++ans1;
                x=x^1;
            }
            if (it==y){
                ++ans2;
                y=y^1;
            }
        }

        return Math.max(ans2,ans1);

    }
}