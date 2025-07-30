class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> rows=new ArrayList<>();
            int n=1;
            for(int j=0;j<=i;j++)
            {
                rows.add(n);
                n=n*(i-j)/(j+1);
            }
            res.add(rows);
        }
        return res;
    }
}