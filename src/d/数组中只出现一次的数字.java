package d;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * @author xie
 *
 */
public class 数组中只出现一次的数字 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        ArrayList<Integer> list = new ArrayList<Integer>(2);
        Arrays.sort(array);
        for(int i=0;i<array.length;){
          if(i<array.length-1&&array[i]==array[i+1]){
              i+=2;
          }else{
              list.add(array[i]);
              i++;
          }
        }
        num1[0]=list.get(0);
        num2[0]=list.get(1);
    }
}
