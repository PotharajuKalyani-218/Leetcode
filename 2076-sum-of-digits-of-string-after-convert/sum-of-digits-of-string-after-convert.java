class Solution {
    public int getLucky(String s, int k) {
        StringBuilder n=new StringBuilder();
        //creating the string of its number equivalent
        for(char c:s.toCharArray()){
            n.append(c-'a'+1);
        }
        //summing the numbers k times
        while(k-->0)
        {
            int m=0;
            for(char d:n.toString().toCharArray())
            {
                m+=(d-'0');
            }
            n=new StringBuilder(String.valueOf(m));
        }
        return Integer.parseInt(n.toString());

        
    }
}