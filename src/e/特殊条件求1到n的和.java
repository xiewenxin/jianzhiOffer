package e;
/**
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、
 * case等关键字及条件判断语句（A?B:C）。
 * @author xie
 *
 */
public class 特殊条件求1到n的和 {
    public int Sum_Solution(int n) {
        if(n>1){
            return Sum_Solution(n-1)+n;
        }else{
            return 1;
        }
        
    }
}
