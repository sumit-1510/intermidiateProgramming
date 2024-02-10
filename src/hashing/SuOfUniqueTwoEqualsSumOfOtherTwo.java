package hashing;
/*
Given an array A of N integers, find the index of values that satisfy P + Q = R + S, where P, Q, R & S are integers values in the array
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class SuOfUniqueTwoEqualsSumOfOtherTwo {


    public static void main(String[] args) {
        ArrayList<Integer> input=new ArrayList<>(Arrays.asList(3,4,7,1,2,9,8));
        System.out.println(equal(input));
    }

    public static ArrayList<Integer> equal(ArrayList<Integer> A) {
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>> m=new HashMap<>();
        for (int i=0;i<A.size();i++){
            for(int j=i+1;j<A.size();j++){
                int sum = A.get(i) + A.get(j);
                if(m.containsKey(sum)){
                    ans.addAll(m.get(sum));
                    ans.add(i);ans.add(j);
                    break;
                }
                else
                    m.putIfAbsent(sum,new ArrayList<>(Arrays.asList(i,j)));
            }
            if(!ans.isEmpty()) break;
        }
        Collections.sort(ans);
        return ans;
    }
}
