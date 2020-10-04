package a;

import java.util.ArrayList;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author xie
 *
 */
public class 调整数组顺序使奇数位于偶数前面 {
	 public void reOrderArray(int [] array) {
	        ArrayList<Integer> array_ji= new ArrayList<Integer>();
			ArrayList<Integer> array_ou= new ArrayList<Integer>();
			for(int i=0;i<array.length;i++) {
				if(array[i]%2==0) {
					array_ou.add(array[i]);
				}else {
					array_ji.add(array[i]);
				}
			}
			array_ji.addAll(array_ou);
			for(int i=0;i<array.length;i++) {
				array[i]=array_ji.get(i);
			}
	    }
}
