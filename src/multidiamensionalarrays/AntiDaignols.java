package multidiamensionalarrays;

import java.util.ArrayList;
import java.util.Arrays;

public class AntiDaignols {
    public static void main(String[] args) {
        // create a sample input
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        A.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        A.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        // call the diagonal method
        System.out.println(diagonal(A));
    }

    public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        int ansrows = A.size() * 2 - 1;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < ansrows; i++) {
            /*ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < A.size(); j++) {
                row.add(0);
            }*/
            ans.add(new ArrayList<>());
        }
        int n = A.size();

        for(int i=0;i<A.size();i++){
            for (int j=0;j<A.size();j++){
                ans.get(i+j).add(A.get(i).get(j));
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            for(int j=ans.get(i).size();j<A.size();j++){
                ans.get(i).add(0);
            }
        }
        return ans;
    }

    /*

     */
}