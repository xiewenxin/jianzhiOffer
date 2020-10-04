package f;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 * @author xie
 *
 */
public class 字符流中第一个不重复的字符 {
static ArrayList<Character> list=new ArrayList<Character>();
static HashSet<Character> set =new HashSet<Character>();
public static void Insert(char ch)
{
	if(set.contains(ch)) ;
    else if(list.contains(ch)) {
    	
    	//注意，需要把ch转成Character，不然会把ch当成下标
    	list.remove((Character)ch);
    	set.add(ch);
    }
    else {
    	list.add(ch);
    }
}
//return the first appearence once char in current stringstream
public static char FirstAppearingOnce()
{
	if(list.size()>0)
	return list.get(0);
	else return '#';
}
public static void main(String[] args) {
	Insert('g');
	System.out.println(FirstAppearingOnce());
	Insert('o');
	System.out.println(FirstAppearingOnce());
	Insert('o');
	System.out.println(FirstAppearingOnce());
	Insert('g');
	System.out.println(FirstAppearingOnce());
	Insert('l');
	System.out.println(FirstAppearingOnce());
	Insert('e');
	System.out.println(FirstAppearingOnce());
}
}

