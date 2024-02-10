package problemsonarrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Print a Pattern According to The Given Value of A.
 *
 * Example: For A = 3 pattern looks like:
 *
 *     1
 *   2 1
 * 3 2 1
 */
public class PatternPrinting {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> solve = solve(5);
        for(ArrayList<Integer> rows:solve){
            System.out.println(rows);
        }
    }
    public static ArrayList<ArrayList<Integer>> solve(int A) {
        int count=1;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
      //  int val=1;
        for(int i=0;i<A;i++){
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<A-count;j++){
                row.add(0);
            }
            int val=count;
            for(int k=A-count;k<A;k++){
                row.add(val--);
            }
            count++;
            ans.add(row);
        }
        return ans;
    }


}
