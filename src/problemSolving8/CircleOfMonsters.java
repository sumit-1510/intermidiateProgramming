package problemSolving8;
/*
You are playing another computer game, and now you have to slay n monsters. These monsters are standing in a circle, numbered clockwise from 1 to n. Initially, the i-th monster has ai health.

You may shoot the monsters to kill them. Each shot requires exactly one bullet and decreases the health of the
 targeted monster by 1 (deals 1 damage to it). Furthermore, when the health of some monster i becomes 0 or less than 0, it dies and explodes,
 dealing bi damage to the next monster (monster i+1, if i < n, or monster 1, if i=n). If the next monster is already dead,
 then nothing happens. If the explosion kills the next monster, it explodes too, damaging the monster after it and possibly triggering another explosion, and so on.

You have to calculate the minimum number of bullets mod 10 9 + 7 you have to fire to kill all n monsters in the circle.

NOTE: If the minimum no. of bullets are x then you have to return x % 1e9 + 7 .*/

import java.math.BigInteger;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CircleOfMonsters {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(7,2,5)),new ArrayList<>(Arrays.asList(15,14,3))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(1,2)),new ArrayList<>(Arrays.asList(2,1))));
    }

    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<BigInteger> temp = new ArrayList<>();
        BigInteger tempSum = BigInteger.valueOf(0);
        for (int i = 0; i < A.size(); i++) {
            temp.add(BigInteger.valueOf(Math.max(0, A.get(i) - (i > 0 ? B.get(i - 1) : B.get(A.size() - 1)))));
            tempSum = tempSum.add(temp.get(i));
        }

        BigInteger minSum = BigInteger.valueOf(Integer.MAX_VALUE);
        BigInteger sum = BigInteger.valueOf(0);
        for (int i = 0; i < A.size(); i++) {
            sum = tempSum.add(BigInteger.valueOf(A.get(i))).subtract(BigInteger.valueOf(Math.max(0, A.get(i) - (i > 0 ? B.get(i - 1) : B.get(A.size() - 1)))));
           // sum=sum;

            minSum= minSum.min(sum);
        }
        BigInteger mod = minSum.mod(BigInteger.valueOf(1000000007));
        return mod.intValue();
    }
}
