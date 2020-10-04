package e;
//student. a am I
//I am a student.
public class 翻转单词顺序列 {
    public static String ReverseSentence(String str) {
    	if(str==null||str.trim().equals("")) return str;
    	String[] split = str.split(" ");
    	int size=split.length;
    	StringBuffer res = new StringBuffer();
    	for(int i=size-1;i>0;i--) {
    		res.append(split[i]+" ");
    	}
    	return res.toString()+split[0];
    }
    public static void main(String[] args) {
		String str = "Student am I";
		System.out.println(ReverseSentence(str));
	}
}
