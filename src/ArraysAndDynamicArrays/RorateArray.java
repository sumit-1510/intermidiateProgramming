package ArraysAndDynamicArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RorateArray {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        ArrayList<Integer> result = solve(new ArrayList<Integer>(integers),2);
        System.out.println(result);

    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, int n) {
        ArrayList<Integer> a = A;
        Collections.reverse(a);
        int l1=0; int r1=n-1; int l2=n;int r2=a.size()-1;
        while(l1<=r1){
            int i1 = A.get(l1);
            int i2=A.get(r1);
            int temp=i1;
            a.set(l1, i2);
            a.set(r1, temp);
            l1++;
            r1--;
        }
        while(l2<=r2){
            int i1 = A.get(l2);
            int i2=A.get(r2);
            int temp=i1;
            a.set(l2, i2);
            a.set(r2, temp);
            l2++;
            r2--;
        }
        return a;

    }
}