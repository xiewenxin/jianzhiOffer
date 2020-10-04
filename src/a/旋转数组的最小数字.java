package a;
/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * @author xie
 *
 */
public class 旋转数组的最小数字 {
	//

	public static int minNumberInRotateArray(int [] array) {
	   int l=0;
	   int r=array.length-1;
	   while(l<r) {
		  int mid=l+(r-l)/2;
		  int res=array[mid];
		  if(res>array[r]) { //最小值在右侧
			l=mid+1;
		  }else if(res<array[r]) { //最小值在左侧，有可能就是mid
			r=mid; 
		  }else {
			 r--;
		  }
	   }
	   return array[l];
	}
	public static void main(String[] args) {
		int[] array= {4,5,6,1};
		int res = minNumberInRotateArray(array);
		System.out.println(res);
	}
	
	
	
	//最菜做法
    public int minNumberInRotateArray_v1(int [] array) {
    if (array.length == 0)
            return 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return array[i + 1];
        }
        return array[0];
    }
}
