package problemsonarrays;

public class SpecialSubsequence {
    public static void main(String[] args) {
        SpecialSubsequence specialSubSequence = new SpecialSubsequence();
        System.out.println(specialSubSequence.solve("SOMEUPPERCASESTRINGGAG"));
    }

    public int solve(String A) {
        int countG=0;
        int ans=0;
        for(int i=A.length()-1;i>=0;i--){
            if (A.charAt(i)=='G'){
                countG++;
            } else if (A.charAt(i)=='A') {
                ans=ans+countG;
            }
            else {
                continue;
            }
        }
        return ans;
    }
}
