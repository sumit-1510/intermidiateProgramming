package contstdiscussion;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Akash has N ingredients, and ith ingredients have Ai sweetness. He wants to make a perfect dish using some given ingredients.
 *
 * A dish will be perfect if it has the following properties
 * There is at least one ingredient in the dish whose sweetness value is a prime number.
 * The total sweetness of the dish must be at least B and at most C.
 * Find the number of ways to make the perfect dish.
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 18
 * 2 <= A[i] <= 109
 * 2 <= B <= C <= 109
 */
public class SweetDish {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(2,2,4,5)),3,7));
        System.out.println(solve(new ArrayList<>(Arrays.asList(1,3,7,4)),5,8));
    }
    public static int solve(ArrayList<Integer> A, int B, int C) {
        int ans=0;
        ArrayList<Boolean> primeList=new ArrayList<>();
        for(int i=0;i< A.size();i++){
            primeList.add(isPrime(A.get(i)));
        }
        ArrayList<ArrayList<Integer>> allSubsets=new ArrayList<>();
        int size = A.size();
        boolean primeEligible=false;
        for (int i=0;i<1<<size;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            int sum=0;
          //  boolean primeFlag=false;
            for(int j=0;j<size;j++){
                if((i&(1<<j))>0){
                    temp.add(A.get(j));
                    if(primeList.get(j)){
                        primeEligible=true;
                    }
                    sum=sum+A.get(j);
                }
            }
            ans=ans+checkIfEligible(primeEligible,B,C,sum);
            primeEligible=false;
            allSubsets.add(temp);
        }
      //  System.out.println("All subsets are "+allSubsets);


        return ans;
    }

    private static int checkIfEligible(Boolean primeEligible, int b, int c, int sum) {
        if(primeEligible && (sum >=b && sum <= c)){
            return 1;
        }
        return 0;
    }


    public static boolean isPrime(int n){
        if(n<=2){
            return true;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
