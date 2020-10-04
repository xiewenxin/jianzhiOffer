package f;
/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 * @author xie
 *
 */
public class 构建乘积数组 {
    public int[] multiply(int[] A) {
        int size = A.length;
        int[] B = new int[size];
        B[0]=1;
      for(int i=1;i<size;i++){
          B[i]=B[i-1]*A[i-1];
      }
        int temp=1;
        for(int j=size-2;j>=0;j--){
            temp*=A[j+1];
            B[j]*=temp;
    }
        return B;
    }
}
