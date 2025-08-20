class Solution {
    public String countAndSay(int n) {
        String res="1";
        for(int i=2;i<=n;i++)
        {
            res=countandadd(res);
        }
        return  res;
        
    }
    public String countandadd(String s)
    {
        StringBuilder ans=new StringBuilder();
        char c=s.charAt(0);
        int ct=1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==c)
                ct++;
            else
            {
                ans.append(ct);
                ans.append(c);
                c=s.charAt(i);
                ct=1;
            }
        }
        ans.append(ct);
        ans.append(c);
        return ans.toString();

    }
}