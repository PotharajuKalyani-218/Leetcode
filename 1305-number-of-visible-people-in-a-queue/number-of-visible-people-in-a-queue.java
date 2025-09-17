class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n=heights.length;
        int [] result=new int[n];
        Stack <Integer> stack=new Stack<>();
        stack.push(heights[n-1]);
        for(int i=n-2;i>=0;i--){
            int count=0;
            while(!stack.isEmpty() && heights[i]>stack.peek()){
                stack.pop();
                count++;
            }
            if(!stack.isEmpty()){
                count++;
            }
            result[i]=count;
            stack.push(heights[i]);
            
        }
        return result;
        
    }
}