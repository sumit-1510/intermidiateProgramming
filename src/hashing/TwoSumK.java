package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSumK {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(-4);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(-5);
        list.add(-3);
        list.add(-9);
        list.add(-4);
        list.add(-9);list.add(-7);list.add(-7);


        TwoSumK objectOfTwoSumK = new TwoSumK();
        ArrayList<Integer> result = objectOfTwoSumK.twoSum(list, -3);
        System.out.println(result);
    }
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        HashMap<Integer,Integer> numSets=new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<A.size();i++){
            int complement = B - A.get(i);
            if (numSets.containsKey(complement)) {
                result.add(numSets.get(complement)+1);
                result.add(i+1);
                return result;
            }
            numSets.putIfAbsent(A.get(i),i);

        }
        return result;
    }
}