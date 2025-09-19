class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int fresh=0,t=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                    fresh++;
                if(grid[i][j]==2)
                    q.offer(new int[]{i,j});
            }
        }
        int [][] directions={{-1,0},{1,0},{0,-1},{0,1}};
        while(q.size()>0 && fresh>0)
        {
            int size=q.size();
            t++;
            for(int i=0;i<size;i++)
            {
                int [] curr=q.poll();
                int x=curr[0],y=curr[1];
                for(int [] dir:directions)
                {
                    int nx=x+dir[0];
                    int ny=y+dir[1];
if(nx>=0 && ny>=0 && nx<grid.length && ny<grid[0].length && grid[nx][ny]==1){
                    grid[nx][ny]=2;
                    fresh--;
                    q.offer(new int[]{nx,ny});
                                 
            }
                }
        }
        }
        return fresh==0?t:-1;
        }
        
    }
