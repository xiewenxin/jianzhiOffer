package a;
/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * @author xie
 *
 */
public class 跳台阶 {
    public static int JumpFloor(int target) {
            if(target<1) return -1;
            if(target<=2) return target;
			int first=1;
			int second=2;
		    int  res=0;
	       for(int i=3;i<=target;i++) {
		     res=first+second;
		     first=second;
		     second=res;
	       }
		 return res;
		
    }
    public static void main(String[] args) {
    	int res = JumpFloor(6);
    	System.out.println(res);
	}
}
