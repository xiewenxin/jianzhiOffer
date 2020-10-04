package g;
/*
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
 * 如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
 *  例如 a b c e s f c s a d e e 矩阵中包含一条字符串"bccced"的路径，
 *  但是矩阵中不包含"abcb"路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，
 *  路径不能再次进入该格子。
 */
public class 矩阵中的路径 {
    boolean flag=false;
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
     if(matrix.length<str.length) return flag;
     for(int i=0;i<matrix.length;i++){
         //开始搜索
         if(matrix[i]==str[0]){
          dfs(matrix,cols,str,i,0);
         }
         if(flag) return flag;
     }
        return flag;
    }
  public void dfs(char[] matrix,int cols, char[] str,int curr_matrix,int curr_str){
              if(curr_str==str.length-1){
                   flag=true;
                   return;
               } 
               int curr;
               //char c ='a';
               char temp=matrix[curr_matrix];
               matrix[curr_matrix]='1';//走过位子的标记
               char l=curr_matrix%cols==0?'1':matrix[curr_matrix-1];
               char r=(curr_matrix+1)%cols==0?'1':matrix[curr_matrix+1];
               char s=curr_matrix<cols?'1':matrix[curr_matrix-cols];
               char x=(matrix.length-curr_matrix)<=cols?'1':matrix[curr_matrix+cols];
                if(l==str[curr_str+1]){
                   curr=curr_matrix-1;
                   dfs(matrix,cols,str,curr,curr_str+1);
                    matrix[curr_matrix]=temp;//回溯
               }
               if(r==str[curr_str+1]){
                   curr=curr_matrix+1;
                   dfs(matrix,cols,str,curr,curr_str+1);
                   matrix[curr_matrix]=temp;//回溯
               }
               if(s==str[curr_str+1]){
                   curr=curr_matrix-cols;
                   dfs(matrix,cols,str,curr,curr_str+1);
                   matrix[curr_matrix]=temp;//回溯
               }
               if(x==str[curr_str+1]){
                   curr=curr_matrix+cols;
                   dfs(matrix,cols,str,curr,curr_str+1);
                   matrix[curr_matrix]=temp;//回溯
               }else{
                   matrix[curr_matrix]=temp;//回溯
                   return ;
               }
              
  }
}
