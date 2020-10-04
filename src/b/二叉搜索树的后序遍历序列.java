package b;
/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。
 * 假设输入的数组的任意两个数字都互不相同。
 * @author xie
 *
 */
public class 二叉搜索树的后序遍历序列 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length<1||sequence==null) return false;
       return VerifySquenceOfBST(sequence,0,sequence.length-1);
    }
    public boolean VerifySquenceOfBST(int [] sequence,int begin,int end) {
         if(begin>=end) return true;
         int index=begin;
         for(;index<end;index++){
         if(sequence[index]>sequence[end]) break;
         }
          for(int i=index;i<end;i++){
              if(sequence[i]<sequence[end]) return false;
          }
         return VerifySquenceOfBST(sequence,begin,index-1)&&VerifySquenceOfBST(sequence,index,end-1);
        }
}
