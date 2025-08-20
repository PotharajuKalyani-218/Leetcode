class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26)
        return false;
        int res[]=new int[26];
        for(char c:sentence.toCharArray())
        {
            if(c>='a' && c<='z')
                res[c-'a']+=1;
            if(c>='A' && c<='Z')
                res[c-'A']+=1;
        }
        for(int i=0;i<26;i++)
        {
            if(res[i]==0)
            return false;
        }
        return true;
        
    }
}