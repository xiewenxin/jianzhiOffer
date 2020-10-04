package g;

import java.util.Comparator;
import java.util.PriorityQueue;

public class 数据流中的中位数 {
    static PriorityQueue<Integer> MinQueue = new PriorityQueue<Integer>();
    static PriorityQueue<Integer> MaxQueue = new PriorityQueue<Integer>(new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
		}
    });
    static int count;
    public static void Insert(Integer num) {
     if((count&1)==1){ //奇数
        if(!MaxQueue.isEmpty()&&num<MaxQueue.peek()){
            MaxQueue.add(num);
            num=MaxQueue.poll();
        }
        MinQueue.add(num); 
     }else{
         if(!MinQueue.isEmpty()&&num>MinQueue.peek()){
            MinQueue.add(num);
            num=MinQueue.poll();
        }
        MaxQueue.add(num); 
     }
        count++;
    }
    public static Double GetMedian() {
         if(count==0)
            throw new RuntimeException("no available number!");
      double result;
     if((count&1)==1){
        result=MaxQueue.peek();
     }else{
          result=(MinQueue.peek()+MaxQueue.peek())/2.0;
     }
        return result;
    }
    public static void main(String[] args) {
		for(int i=0;i<12;i++) {
			Insert(i);
			System.out.println(GetMedian()); 
		}
	}
}
