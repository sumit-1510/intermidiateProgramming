package sortingintro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthSmallestNumber {
    public static void main(String[] args) {

    }
    public static int kthsmallest(final List<Integer> A, int B) {
        List<Integer> C=new ArrayList<>(A);
        for(int k=0;k<B;k++){
            int min=Integer.MAX_VALUE;
            int minIndex=-1;
            for(int i=k;i<C.size();i++){
                if(C.get(i)<min){
                    min=C.get(i);
                    minIndex=i;
                }
            }

            int temp= C.get(k);
            // System.out.println("temp value is "+temp);
            C.set(k,min);
            C.set(minIndex,temp);
        }
        return C.get(B-1);
    }
}
