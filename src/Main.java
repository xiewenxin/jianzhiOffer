import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


/*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
******************************开始写代码******************************/
	//2.33.128.9
	//2.33.128.0/24
	//
    static boolean CheckBlackList(String userIP, String blackIP) {
    	String[] split_userIP = userIP.split("\\.");
    	String[] split_blackIP = blackIP.split("\\.");
    	String res_user="";
    	for(int i=0;i<3;i++) {
    		res_user+=split_userIP[i];
    	}
    	String res_p="";
    	for(int i=0;i<3;i++) {
    		res_p+=split_blackIP[i];
    	}
    	String user=split_userIP[split_userIP.length-1];
    	String black=split_blackIP[split_blackIP.length-1];
    	int begin=Integer.parseInt(black.split("/")[0]);
    	int end=Integer.parseInt(black.split("/")[1]);
    	int current=Integer.parseInt(user);
    	if(res_user.equals(res_p)&&current>=begin&&current<=end) {
    		return true;
    	}
		return false;
   

    }
/******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean res;
            
        String _userIP;
        try {
            _userIP = in.nextLine();
        } catch (Exception e) {
            _userIP = null;
        }
        
        String _blackIP;
        try {
            _blackIP = in.nextLine();
        } catch (Exception e) {
            _blackIP = null;
        }
  
        res = CheckBlackList(_userIP, _blackIP);
        System.out.println(String.valueOf(res ? 1 : 0));  
    }
}
