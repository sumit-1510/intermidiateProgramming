package contstdiscussion;

import java.util.ArrayList;

/*
Anurag left his job as a travelling salesman. He started his own venture "MacroHard" and became a successful businessman.
He is planning a road trip along with his friends. So, he went to a car rental company to rent a car. The Car rental company showed him A cars parked in a row.

Anurag has a superstition that he always buys things as a contiguous subarray.

So, he asked you a question: Considering all ways to rent the cars; for each car, find the number of ways to rent it.
 */
public class CarRental {
    public static void main(String[] args) {
        System.out.println(solve(4));
        System.out.println(solve(3));
    }
    public static  ArrayList<Integer> solve(int A){
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1;i<=A;i++){
            ans.add(i*(A-i+1));
        }
        return ans;
        // 1 2 3 4 5
    }
}
