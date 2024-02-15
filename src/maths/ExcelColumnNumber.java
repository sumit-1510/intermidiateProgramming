package maths;
/*
Given a column title as appears in an Excel sheet, return its corresponding column number.
 */
public class ExcelColumnNumber {
    public static void main(String[] args) {
        int a='A';
        int z='Z';
      //  System.out.println("Value a "+a+" and value z is "+z+ " and z-a is "+(z-a+1));
        System.out.println(titleToNumber("AAA"));
    }
    public static  int titleToNumber(String A) {
        String str = A.toUpperCase();
        int start=0;
        int result = 0;
        for (int i =str.length()-1; i >=0; i--) {
            int k = str.charAt(i) - 'A' + 1;
            double v = k * Math.pow(26, start);
            result+= (int) v;
            start++;
        }
        return result;
    }
}
