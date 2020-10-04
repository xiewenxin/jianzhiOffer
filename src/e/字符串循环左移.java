package e;

public class 字符串循环左移 {
    public static String LeftRotateString(String str,int n) {
    	if(str==null||str.trim().equals("")) return str;
        int len=str.length();
        //abcXYZdef
        //abcXYZdefabcXYZdef
        str=str+str;
        int begin=n%len;//计算起始位置
        return str.substring(begin,begin+len);
      }
    public static void main(String[] args) {
    	//abcXYZdef
    	//XYZdefabc
		System.out.println(LeftRotateString("abcXYZdef", 3));
	}
}
