class Solution {
    public String getHint(String secret, String guess) {
        int c=0;
        int b=0;
        int A []=new int [10];
        for(int i=0;i<guess.length();i++)
        {
            int s1=secret.charAt(i)-'0';
            int g1=guess.charAt(i)-'0';
            if(s1==g1)
                b++;
            else
            {
                if(A[s1]<0)
                    c++;
                if(A[g1]>0)
                    c++;
                A[s1]++;
                A[g1]--;
            }

        }
        return b+"A"+c+"B";
        
    }
}