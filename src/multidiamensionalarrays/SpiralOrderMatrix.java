package multidiamensionalarrays;

import java.util.ArrayList;

public class SpiralOrderMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = generateMatrix(5);
        for (ArrayList<Integer> row : matrix) {
            for (int number : row) {
                System.out.print(number + "\t");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        int totalElements=A*A;
        int left=0;int right=A-1;
        int top=0;int bottom=A-1;
        String dir="right";

        int count=1;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for (int i = 0; i < A; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < A; j++) {
                row.add(0);
            }
            ans.add(row);
        }

        while(left<=right && top<=bottom) {
            if (dir.equalsIgnoreCase("right")) {
               // ArrayList<Integer> topList = ans.get(top);
                for (int i = left; i <= right; i++) {

                    // topList.set(i, count++);
                    ans.get(top).set(i, count++);
                }
                // ans.set(top,topList);
                top++;
                dir = "bottom";

            }
            if (dir.equalsIgnoreCase("bottom")) {

                for (int i = top; i <= bottom; i++) {
                    ans.get(i).set(right, count++);
                }
                right--;
                dir = "left";

            }
            if (dir.equalsIgnoreCase("left")) {
                //ArrayList<Integer> bottomList=new ArrayList<>();
                for (int i = right; i >= left; i--) {
                    ans.get(bottom).set(i, count++);
                }
                bottom--;
                dir = "up";
            }

            if (dir.equalsIgnoreCase("up")) {
                for (int i = bottom; i >= top; i--) {
                    ans.get(i).set(left, count++);
                }
                left++;
                dir = "right";
            }
        }

        return ans;
    }
}