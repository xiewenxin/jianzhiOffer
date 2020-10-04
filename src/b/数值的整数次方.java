package b;
/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。

保证base和exponent不同时为0
 * @author xie
 *
 */
public class 数值的整数次方 {
    //基础解法
    public double Power(double base, int exponent) {
        double  result=1;
        for(int i=0;i<Math.abs(exponent);i++){
            result*=base;
        }
        if(exponent<0){
            result=1/result;
        }
        return result;            
  }
}
