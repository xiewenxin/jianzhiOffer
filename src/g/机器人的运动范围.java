package g;
/**
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），
 * 因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 * @author xie
 *
 */
public class 机器人的运动范围 {
    int count=0;
	 public  int movingCount(int threshold, int rows, int cols)
	 {
         boolean[] martix=new boolean[rows*cols];
		    dfs(0,0,threshold,rows,cols,martix);
	        return count;
	    }
	 public  void dfs(int row,int col,int t, int rows, int cols,boolean[] m) {
		   if(row>=rows||row<0||col>=cols||col<0||m[row*cols+col]||!valid(row,col,t)) return ;
			 count ++;
			 m[row*cols+col]=true;
			 //上、下、左、右
			 dfs(row-1,col,t,rows,cols,m);
			 dfs(row+1,col,t,rows,cols,m);
			 dfs(row,col-1,t,rows,cols,m);
			 dfs(row,col+1,t,rows,cols,m);
	 }
	 public  boolean valid(int row,int col,int k) {
		 int sum=0;
      while(row>0){
         sum+=row%10;
         row=row/10;
      }
      while(col>0){
        sum+=col%10;
        col= col/10;
      }
      return sum<=k;
	 }
}
