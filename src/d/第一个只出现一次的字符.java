package d;
/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 
 * 如果没有则返回 -1（需要区分大小写）.
 * @author xie
 *
 */
public class 第一个只出现一次的字符 {
    public int FirstNotRepeatingChar(String str) {
        int[] arr= new int[58];
        for(int i=0;i<str.length();i++){
            int index= (int)(str.charAt(i)-65);
            arr[index]+=1;
        }
          for(int i=0;i<str.length();i++){
            int index= (int)(str.charAt(i)-65);
            if(arr[index]==1) return i;
        }
        return -1;
    }
}
