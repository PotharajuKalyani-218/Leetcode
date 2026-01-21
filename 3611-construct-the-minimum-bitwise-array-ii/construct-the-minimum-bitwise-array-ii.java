class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int [] arr=new int[n];

        for(int i=0;i<n;i++){
            int num=nums.get(i);
            int pattern=1;
            int res=-1;

            while((num & pattern ) !=0 ){

                res=num-pattern;
                pattern<<=1;
                }
                arr[i]=res;            
            
                  } 
        return arr;
    }
}