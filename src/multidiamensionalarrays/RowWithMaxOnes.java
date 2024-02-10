package multidiamensionalarrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RowWithMaxOnes {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> sampleInput = new ArrayList<>();
        sampleInput.add(new ArrayList<>(Arrays.asList(0, 0, 1, 1)));
        sampleInput.add(new ArrayList<>(Arrays.asList(0, 1, 1, 1)));
        sampleInput.add(new ArrayList<>(Arrays.asList(0, 0, 0, 1)));
        sampleInput.add(new ArrayList<>(Arrays.asList(1, 1, 1, 1)));

        int resultRow = solve(sampleInput);
        System.out.println("Row index with maximum ones: " + resultRow);
    }

    public static int solve(ArrayList<ArrayList<Integer>> A) {
        int ansRow=0;
        int maxOnes=0;
        for (int i=0;i<A.size();i++){
            for(int j=A.get(i).size()-1;j>=0;j--){
                if (A.get(i).get(j)==0){
                    break;
                }
                else
                {
                    ansRow=i;
                    maxOnes++;
                    continue;
                }
            }
        }
        return ansRow;
    }
}