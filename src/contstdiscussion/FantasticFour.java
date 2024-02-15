package contstdiscussion;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * An array is fantastic if all of its elements are divisible by 4. Given an array A of N integers, return the minimum number of operations to make the array fantastic.
 *
 * In one operation, you can remove any two array elements from the array, sum them up and append this sum to the end of the array A.
 *
 * Return -1 if it is not possible to make the array "fantastic".
 */
public class FantasticFour {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(1, 3, 4, 4, 2, 2))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(4,2,2))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(1,1,1,1,3,3,3,3))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(1,3,3,3,2,2,2,2,2))));
    }
    public static int solve(ArrayList<Integer> A) {
        int ans=0;
        ArrayList<Integer> modArray =new ArrayList<>(Arrays.asList(0,0,0,0));
        for (Integer i : A) {
            int index = i % 4;
            Integer temp = modArray.get(index);
            modArray.set(index,++temp);
        }
        System.out.println("Mod array is "+modArray);
        int totalMod1=modArray.get(1);
        int totalMod2=modArray.get(2);
        int totalMod3=modArray.get(3);
        ans+=(totalMod2/2);
        totalMod2=totalMod2%2;

        if(totalMod3>=totalMod1){
            int i = totalMod3 - totalMod1;
            ans=ans+ totalMod1;
            totalMod1=0;
            totalMod3=i;

        }else{
            int i = totalMod1 - totalMod3;
            ans=ans+ totalMod3;
            totalMod3=0;
            totalMod1=i;
        }

        ans+=(totalMod1/4)*3;
        totalMod1=totalMod1%4;

        ans+=(totalMod3/4)*3;
        totalMod3=totalMod3%4;


        //Now left with max one value in mod 2 and 0,1,2,3 values in either mod3 or mod1

        //case 1:: No values left in mod2, check if all 0 and return
        if(totalMod3==0 && totalMod2==0 && totalMod1==0){
            return ans;
        }

        // case 2: One value left in mod 2 and some values left in mod 3
        if(totalMod3/2>0 && totalMod3%2==0){
            ans=ans+2;
            return ans;
        }
        //case 3: one value left in mod 2 and some values left in mod 1
        if(totalMod1/2>0 && totalMod1%2==0){
            ans=ans+2;
            return ans;
        }
        return -1;

    }
}
