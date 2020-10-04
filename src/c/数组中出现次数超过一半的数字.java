package c;

import java.util.HashMap;

public class 数组中出现次数超过一半的数字 {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int res=0;
        if(array.length==1) return array[0];
        for(int i=0;i<array.length;i++){
           if(map.containsKey(array[i])){
               int sum=map.get(array[i])+1;
               if(sum>array.length/2){
                   res=array[i];
                   return res;
               }
                map.put(array[i],sum);
           }
           else map.put(array[i],1);
        }
          return 0;
    }
}
