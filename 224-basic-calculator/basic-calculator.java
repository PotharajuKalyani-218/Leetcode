class Solution {
    public int calculate(String s) {
        int res=0;
        int n=0;
        int sign=1;
        Stack<Integer> stack = new Stack<>(); 

        for(char ch:s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                n=n*10+(ch-'0');
            }
            else if(ch=='+')
            {
                res+=n*sign;
                n=0;
                sign=1;
            }
             else if(ch=='-')
            {
                res+=n*sign;
                n=0;
                sign=-1;
            }
            else if(ch=='(')
            {
                stack.push(res);
                stack.push(sign);
                res=0;
                sign=1;
            }
            else if(ch==')')
            {
                res=res+n*sign;
                res=res*stack.pop();
                res=res+stack.pop();
                n=0;
            }

        }
        return res+(n*sign);
        
    }
}