package e;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
 * 
 * 对应每个测试案例，输出两个数，小的先输出。
 * @author xie
 *
 */

//左右双指针
public class 和为S的两个数字 {
	  public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
	     int plow=0;
	     ArrayList<Integer> res =new ArrayList(2);
	     int phight=array.length-1;
	     while(plow<phight) {
	    	 int temp=array[plow]+array[phight];
	    	 if(temp<sum) plow++;
	    	 else if(temp>sum) {
	    		 phight--;
	    	 }else {
	    		  //因为是从外层往里夹，所以最先得到的肯定乘积最小，直接返回
	    			res.add(array[plow]);
	    			res.add(array[phight]);
	    		    return res;
	    	 }
	     }
		 return res;
	    }
	  public static void main(String[] args) {
		  int[] array= {1,3,4,6,8,9};
		  ArrayList<Integer> res = FindNumbersWithSum(array,12);
		  System.out.println(res);
	}
}
