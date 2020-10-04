import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
	 static int  count=0;
	 static int[] dp;
	public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
	        int res;
	    
	        int _matrixGrid_rows = 0;
	        int _matrixGrid_cols = 0;
	        _matrixGrid_rows = Integer.parseInt(in.nextLine().trim());
	        _matrixGrid_cols = Integer.parseInt(in.nextLine().trim());
	        dp=new int[_matrixGrid_cols];
	        Arrays.fill(dp, 1);
	        int[][] _matrixGrid = new int[_matrixGrid_rows][_matrixGrid_cols];
	        for(int _matrixGrid_i=0; _matrixGrid_i<_matrixGrid_rows; _matrixGrid_i++) {
	            for(int _matrixGrid_j=0; _matrixGrid_j<_matrixGrid_cols; _matrixGrid_j++) {
	                _matrixGrid[_matrixGrid_i][_matrixGrid_j] = in.nextInt();
	                
	            }
	        }
	        
	        if(in.hasNextLine()) {
	          in.nextLine();
	        }
	  
	        dfs(1,_matrixGrid_rows-1,_matrixGrid);
	        System.out.println(String.valueOf(dp[_matrixGrid_cols-1]));    
	}

	 
	 public static  void dfs(int row,int rows,int[][] m) {
		   if(row>rows) return ;
		   for(int i=1;i<dp.length;i++) {
			   if(m[row][i]!=1) {
				   dp[i]=dp[i]+dp[i-1]; 
			   }else {
				   dp[i]=0;
			   }
		   }
		   dfs(++row,rows,m);
	 }
	
}
