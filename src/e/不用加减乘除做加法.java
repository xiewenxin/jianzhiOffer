package e;

import java.math.BigInteger;

public class 不用加减乘除做加法 {
    public int Add(int num1,int num2) {
          BigInteger int1 = new BigInteger(String.valueOf(num1));
          BigInteger int2 = new BigInteger(String.valueOf(num2));
          return int1.add(int2).intValue();
     }
    public int Add_V2(int num1,int num2) {
        while (num2!=0) {
            int temp = num1^num2;
            num2 = (num1&num2)<<1;
            num1 = temp;
        }
        return num1;
    }
}
