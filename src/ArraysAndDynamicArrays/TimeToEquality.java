package ArraysAndDynamicArrays;

import java.util.ArrayList;
import java.util.Collections;

public class TimeToEquality {
    public static int solve(ArrayList<Integer> A) {
        Integer max = Collections.max(A);
        int ans=0;
        for (int i = 0; i < A.size(); i++) {
            ans += max - A.get(i);
        }
        return ans;
    }

}
