package DS_Practice.Graph.FloodFill_Algorithm;

class FloodFill
{
    public static void dfs(int row, int col,int[][] ans, int[][] image, int newColor, int[] delRow,int[] delCol,int iniColor)
    {
        ans[row][col] = newColor;
        System.out.println("row "+row+"Col "+col);
        int n = image.length;
        int m = image[0].length;
        for(int i=0; i<4; i++)
        {
            System.out.println("in 1");
            int nrow = row+delRow[i];
            int ncol = col+delCol[i];
            System.out.println("nrow ");
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==iniColor && ans[nrow][ncol]!=newColor)
            {
                System.out.println("in rec");
                dfs(nrow,ncol,ans,image,newColor,delRow,delCol,iniColor);
            }
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        // Code here
        int[][] ans = image;
        int iniColor = image[sr][sc];
        int[] delRow = {-1,0,+1,0};
        int[] delCol = {0,+1,0,-1};

        dfs(sr,sc,ans,image,newColor,delRow,delCol,iniColor);
        return ans;

    }

    public static void main(String[] args) {
        int[][] image = {{1,1,0},
                         {1,0,1},
                         {1,1,2}};
        floodFill(image,1,1,2);
    }
}