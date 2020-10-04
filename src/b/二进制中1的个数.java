package b;

public class 二进制中1的个数 {
	 public static int NumberOf1(int n) {
        String binaryString = Integer.toBinaryString(n);
		return binaryString.replaceAll("0", "").length();
    }
	 //推荐用法
	 public static int NumberOf1_V2(int n) {
			int res=0;
			while(n!=0) {
				n=n&(n-1);//消除一个1,若1的位数较少时，更加快速
				res++;
			}
			return res;
	    }
	 
	 public static int find1_V1(int n) {
			int res=0;
			while(n!=0) {
			if((n&1)==1) res++;
			n=n>>>1;//将数字无符号右移一位
			}
			return res;
		}
	 public static void main(String[] args) {
		 int a=-2147483648;
		 int res0=find1_V1(a);
		 int res1 = NumberOf1(a);
		 int res2 = NumberOf1_V2(a);
		 String res= Integer.toBinaryString(a);
		 System.out.println(res0+"..."+res1+"..."+res2+"..."+res);
	}
}
