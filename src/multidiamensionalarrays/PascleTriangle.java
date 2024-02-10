package multidiamensionalarrays;

import java.util.ArrayList;

public class PascleTriangle {
    public static void main(String[] args) {
        System.out.println(solve(5));
    }
    public static ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> ansList=new ArrayList<>();
        for(int i=0;i<A;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<A;j++){
                temp.add(0);
            }
            ansList.add(temp);
        }

        for (int i=0;i<A;i++){
            for(int j=0;j<A;j++){
                if(j==0){
                    ansList.get(i).set(j,1);
                }
               if(i==0){
                   continue;
               }

                if(j!=0)
               ansList.get(i).set(j,(ansList.get(i-1).get(j-1)+ansList.get(i-1).get(j)));
            }
        }

        return ansList;
    }
}
