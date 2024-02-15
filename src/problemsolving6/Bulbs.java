package problemsolving6;

import java.util.ArrayList;

/**
 * A wire connects N light bulbs.
 *
 * Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.
 *
 * Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.
 *
 * You can press the same switch multiple times.
 *
 * Note: 0 represents the bulb is off and 1 represents the bulb is on.
 */
public class Bulbs {
    public static void main(String[] args) {

    }
    public static int bulbs(ArrayList<Integer> A) {

        int countAns=0;

        for (int i = 0; i < A.size(); i++) {

            if(A.get(i)==0 && countAns%2==0){
                countAns++;
            } else if (A.get(i)==1 && countAns%2==1) {
                countAns++;
            }


        }
        return countAns;

    }
}
