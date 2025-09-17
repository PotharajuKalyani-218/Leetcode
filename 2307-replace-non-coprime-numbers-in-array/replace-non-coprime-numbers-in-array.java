class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        int n=nums.length;
        int [] st=new int[n];
        int top=-1;
        for(int num:nums)
        {
            while(top!=-1)
            {
                int g=GCD(num,st[top]);
                if(g==1) break;
                else{
                     num*=st[top--]/g;
                }
            }
                st[++top]=num;

            
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<=top;i++)
        {
            res.add(st[i]);
        }
        return res;
        
        
    }
    int GCD( int a,int b)
    {
        return b==0?a:GCD(b,a%b);
    }
}