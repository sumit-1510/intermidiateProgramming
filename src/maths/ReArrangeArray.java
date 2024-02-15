package maths;

import java.util.ArrayList;

/*
Given an array A of size N. Rearrange the given array so that A[i] becomes A[A[i]] with O(1) extra space.
 */
public class ReArrangeArray {
    public static void main(String[] args) {

    }

    public void arrange(ArrayList<Integer> a) {
        int size = a.size();
        //2,1,3,0
        //x=2 y=3 -> 2+ 3*4
        //0,1,2,3
        for (int i = 0; i < a.size(); i++) {
            int x = a.get(i);
            int y = a.get(x);

            int toStore = x + ((y % size) * size);
            a.set(i, toStore);

        }

        for (int i = 0; i < a.size(); i++) {
            a.set(i, (a.get(i)) / size);
        }

    }
}
