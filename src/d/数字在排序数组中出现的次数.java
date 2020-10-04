package d;

import java.util.Arrays;

public class 数字在排序数组中出现的次数 {
    public static int GetNumberOfK(int [] array , int k) {
      int res = Arrays.binarySearch(array, k);//快速找到k的位置
      if(res<0) return 0;
      int l=res;
      int r=res;
      //向左找到第一个不为k的位置
      while(l>=0&&array[l]==k) {
    	  l--;
      }
      //向右找到第一个不为k的位置
      while(r<=array.length-1&&array[r]==k) {
    	 r++;
      }
      return r-l-1;
    }
    public static void main(String[] args) {
		int[] array= {1,3,3,3,3,4,5};
		int res = GetNumberOfK(array,2);
		System.out.println(res);
	}
}
