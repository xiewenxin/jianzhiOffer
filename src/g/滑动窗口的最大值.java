package g;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
 * 他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 *  {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}，
 *   {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 * @author xie
 *
 */
public class 滑动窗口的最大值 {
	//双端队列求解,对头存储窗口最大值的下标，队列从对头到队尾不递增。O(n)的复杂度
	public static ArrayList<Integer> maxInWindows(int [] num, int size){
		    LinkedList<Integer> queue=new LinkedList<Integer>();
	        ArrayList<Integer>    res=new ArrayList<Integer>();
	        if(size<=0||size>num.length) return res;
	        for(int i=0;i<num.length;i++) {
	        	//维护单调不递增的性质
	             while(!queue.isEmpty()&&num[i]>num[queue.getLast()]) {
	        			queue.removeLast();
	             }
	        	queue.addLast(i);
	        	if(i>=size-1) {
	            	res.add(num[queue.getFirst()]);
	        	}
	        	//判断对头是否过期
	        	if(i-queue.getFirst()>=size-1) {
	        		queue.removeFirst();
	        	}
	        }
	        return res;
    }
   public static void main(String[] args) {
	int[] arr= {6,14,12,10,8,6,4};
	ArrayList<Integer> res = maxInWindows(arr,5);
	System.out.println(res);
}
	
	
	
	
	
	
	
	
	
	
	
	//暴力求解 O(m*n)
    public ArrayList<Integer> maxInWindows_V2(int [] num, int size)
    {
        ArrayList<Integer> res= new ArrayList<Integer>();
        //if(size==1) return res.addAll(num);
        if(num==null||size>num.length||size==0) return res;
        int maxValue=0;
        int l=0;
        int r=l+size-1;
        while(r<num.length){
            int temp=findMax(num,l,r);
            res.add(temp);
            l++;
            r++;
        }
        return res;
       
    }
    public int findMax(int[] arr,int l,int r){
        int result=Integer.MIN_VALUE;;
        for(int i=l;i<=r;i++){
            result=Math.max(result,arr[i]);
        }
        return result;
    }
}
