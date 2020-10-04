package quna;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 9月1日是开学的日子，Jessie的儿子从小学毕业，步入了初中生活。
 * 回家后，Jessie照常辅导儿子写作业，在辅导作业的过程中，儿子问Jessie，
 * (a+b)^2的展开式是什么？Jessie告诉儿子，展开式为a^2+2ab+b^2，儿子接着问Jessie，
 * 那么(a+b)^3呢？Jessie想了一下答道，是a^3+3a^2b+3ab^2+b^3，儿子不甘心问不倒妈妈，
 * 接着问，那么(a+b)^10次方的展开式是什么呢？Jessie笑了一下，说到，妈妈给你写个程序吧。
 * @author xie
 *
 */
public class Main {
public static void main(String[] args) throws Exception {
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	ArrayList<Integer> res=new ArrayList<Integer>();
	 M=new int[n+1];
	for(int i=0;i<n+1;i++) {
		if(i>n/2) {
		    res.add(res.get(n-i));	
		}else {
			res.add(CaculateCmn(n,i));
		}	
	}
	for(int i=0;i<res.size()-1;i++) {
		System.out.print(res.get(i)+" ");
	}
	System.out.println(res.get(res.size()-1));
}
static int[] M;
public static int CaculateCmn(int m,int n) throws Exception {
	if(n==0) {
		M[0]=1;
		return 1;
	}
	if(n==1) {
		M[n]=m;
		return m;
	}
	if(n>m) throw new Exception("n 不能大于m");
	int res=M[n-1]*(m-n+1)/n;
	M[n]=res;
	return res;
}

}
