package g;
/**
 * 长度为n的绳子，剪成m段，分别为n1,n2,....,nm.n,m均为整数，n>1,m>1，求n1*n2*...*nm的最大值，即求各段长度乘积的最大值。
 * @author xie
 *
 */
public class 剪绳子 {
	public int cutRope(int target) {
	    if (target < 2) return 0;
		if (target==2) return 1;
		if (target==3) return 2;
		//target=3*num_3+2*num_2;优先分配给3，但是target=4时，2*2>3*1；
		int num_3=target/3;
		if(target-num_3*3==1) num_3--;
		int num_2=(target-num_3*3)/2;
		return (int) (Math.pow(3,num_3)*(int)Math.pow(2,num_2));
		
	}
}
