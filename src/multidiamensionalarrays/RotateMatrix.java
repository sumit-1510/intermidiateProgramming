package multidiamensionalarrays;

import java.util.ArrayList;
import java.util.Collections;

public class RotateMatrix {
    public static void main(String[] args) {
        int count=0;
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for(int i=0; i<5; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0; j<5; j++){
                list.add(count++);
            }
            matrix.add(list);
        }
        solve(matrix);
    }

    public static void solve(ArrayList<ArrayList<Integer>> A){
        System.out.println("Initially");
        A.forEach(n-> System.out.println(n+"\t"));
        for(int i=0;i<A.size();i++){
            for (int j=i;j<A.size();j++){
                int ij = A.get(i).get(j);
                Integer ji = A.get(j).get(i);
                A.get(i).set(j, ji);//
                A.get(j).set(i,ij);
            }
            System.out.println();
            A.forEach(n-> System.out.println(n+"\t"));
        }

        System.out.println("Output after Transpose");
        A.forEach(n-> System.out.println(n+"\t"));
        for (int i = 0; i < A.size(); i++) {
            Collections.reverse(A.get(i));
        }

        System.out.println("Final ans post reversing each row of the transposed Matrix");
        A.forEach(n-> System.out.println(n+"\t"));
    }
}