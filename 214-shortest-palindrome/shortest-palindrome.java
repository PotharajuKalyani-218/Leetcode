class Solution {
    public String shortestPalindrome(String s) {
        int l=0;
        int n=s.length();
        if(s==null || s.length()==0)
            return s;
        for(int r=n-1;r>=0;r--)
        {
            if(s.charAt(r)==s.charAt(l))
                l++;
        }
        if(l==n)
         return s;
         String suffix=s.substring(l);
         StringBuilder res=new StringBuilder(suffix);
         return res.reverse().append(shortestPalindrome(s.substring(0,l))).append(suffix).toString();
        
    }
}