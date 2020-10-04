package b;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵：
 *  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author xie
 *
 */
public class A顺时针打印矩阵 {
	 public  ArrayList<Integer> printMatrix(int[][] matrix) {
         ArrayList<Integer> result = new ArrayList<Integer>() ;
	     if(matrix.length==0||matrix==null) {
				return result;
			}
			print(matrix,0,0,matrix.length-1,matrix[0].length-1,result);
			return result;
			
		}
	    public  void print(int[][] matrix,int start_row,int start_col,int end_row,int end_col,ArrayList<Integer> result) {
			if(start_row<end_row&&start_col<end_col) {
				
				for(int i=start_col;i<end_col;i++) {
					result.add(matrix[start_row][i]);
				}
				
				for(int i=start_row;i<end_row;i++) {
					result.add(matrix[i][end_col]);
					
				}for(int i=end_col;i>start_col;i--) {
					result.add(matrix[end_row][i]);
					
				}for(int i=end_row;i>start_row;i--) {
					result.add(matrix[i][start_col]);
				}
				print(matrix,start_row+1,start_col+1,end_row-1,end_col-1,result);
			}else if(start_row<end_row&&start_col==end_col) {
				for(int i=start_row;i<end_row+1;i++) {
					result.add(matrix[i][end_col]);
				}
			}else if(start_row==end_row&&start_col<end_col) {
				for(int i=start_col;i<end_col+1;i++) {
					result.add(matrix[start_row][i]);
				}
			}else if(start_row==end_row&&start_col==end_col) {
	    		result.add(matrix[start_row][end_col]);
			}else {
				return;
			}
			
		}
}
