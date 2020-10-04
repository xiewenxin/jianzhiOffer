package c;

import java.util.ArrayList;
/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。

 * @author xie
 *
 */
public class 字符串的排列 {
    static ArrayList<String> list;
    public  ArrayList<String> Permutation(String str) {
        if(str==null) return null;
        list =new  ArrayList<String>();
        StringBuffer sb = new StringBuffer(str);
        StringBuffer after = new StringBuffer();
        
        Permutation(after,sb);
        return list;
    }
     public  void Permutation(StringBuffer after,StringBuffer before) {
         //base case
    	 if(before.length()==1) {
        	 after.append(before);
        	 if(!list.contains(after.toString())) list.add(after.toString());
             return ;
         }
    	
         for(int i=0;i<before.length();i++) {
        	 StringBuffer s_before = new StringBuffer(before); 
	    	 StringBuffer s_after = new StringBuffer(after);
	    	 s_after.append(s_before.charAt(i));
	    	 s_before.deleteCharAt(i);
	    	 Permutation(s_after,s_before);
         }
     }
}
