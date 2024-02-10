package sortingintro;

import java.util.ArrayList;
import java.util.Arrays;

public class AdjacentColors {
    public static void main(String[] args) {
        System.out.println(sortColors(new ArrayList<>(Arrays.asList(0, 1, 2, 0, 1, 2,2,2))));
    }
    public static  ArrayList<Integer> sortColors(ArrayList<Integer> A) {
        int countZero=0;
        int countOne=0;
        int countTwo=0;
        for(Integer a:A)
       {
            if(a==0)countZero++;
            else if (a==1) {
                countOne++;
            }
            else countTwo++;
        }
        System.out.println("No of Zeros "+countZero);
        System.out.println("No of Ones "+countOne);
        System.out.println("No of Twos "+countTwo);
        for (int i=0;i<A.size();i++){
            if (countZero > 0) {
                A.set(i, 0);
                countZero--;
            } else if (countOne > 0) {
                A.set(i, 1);
                countOne--;
            } else {
                A.set(i, 2);
                countTwo--;
            }
        }
        return A;
    }
}
