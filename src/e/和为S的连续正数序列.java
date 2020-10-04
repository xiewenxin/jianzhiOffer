package e;
import java.util.ArrayList;
public class 和为S的连续正数序列 {
/**
 * 双指针法
 * 
 */
 public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
         //左指针
	     int plow=1;
	     //右指针
	     int phight=2;
	     while(plow<phight&&phight<=sum) {
	    	int temp= (plow+phight)*(phight-plow+1);
	    	 if(temp==sum*2) {
	    		 ArrayList<Integer> list=new ArrayList<Integer>();
	    		 for(int i=plow;i<=phight;i++) {
	    			 list.add(i);
	    		 }
	    		 ans.add(list);
	    		 plow++;
	    	 }else if(temp>2*sum) {
	    		 plow++;//大了，移动左指针
	    	 }else phight++; //小了，移动右指针
	     }
	        return ans;
	    }
//
 public ArrayList<ArrayList<Integer> > FindContinuousSequence_V2(int sum) {
     ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
     for (int n = (int) Math.sqrt(2 * sum); n >= 2; n--) {
         if ((n & 1) == 1 && sum % n == 0 || (sum % n) * 2 == n) {
             ArrayList<Integer> list = new ArrayList<>();
             for (int j = 0, k = (sum / n) - (n - 1) / 2; j < n; j++, k++) {
                 list.add(k);
             }
             ans.add(list);
         }
     }
     return ans;
 }
 public static void main(String[] args) {
	 ArrayList<ArrayList<Integer>> res = FindContinuousSequence(9);
	 System.out.println(res);
}
	
}
