package d;

import java.util.Arrays;
import java.util.Comparator;
/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * @author xie
 *
 */
public class 把数组排成最小的数 {
    public String PrintMinNumber(int [] numbers) {
        String [] arr =new String[numbers.length];
  	for(int i=0;i<numbers.length;i++) {
  		arr[i]=numbers[i]+"";
  	}
  	Arrays.sort(arr,new Comparator<String>() {
  		@Override
  		public int compare(String o1, String o2) {
  			  String c1 = o1 + o2;
              String c2 = o2 + o1;
              return c1.compareTo(c2);
  		}
  	});
  	StringBuffer sb = new StringBuffer();
  	
  	for(int i = 0; i < numbers.length; i++){
          sb.append(arr[i]);
      }
      return sb.toString();
      }
}
