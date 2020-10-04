package quna;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr =new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	int res = fun(arr,arr.length);
	System.out.println(res);
	int[] array= {2,6,8,3,7,4,9};
	bubblesort(array);
	for(int i:array) {
		System.out.print(i+" ");
	}
	
}
/**
 * 1,2,3,4
 * 2+ 1+3+1+4
 * 2+ 1+4+2+2
 * @param arr
 * @param n
 * @return
 */
public static int fun(int[] arr,int n) {
	if(n==1||n==2) return arr[n-1];
	else if(n==3){
		return arr[0]+arr[1]+arr[2];
	}else {
		return fun(arr,n-2)+Math.min(arr[n-1]+arr[n-2]+2*arr[0],arr[n-1]+arr[1]*2+arr[0]);
	}
}
public static void bubblesort(int[] array) {
	if(array==null||array.length<1) return ;
	for(int i=array.length-1;i>0;i--) {
		for(int j=0;j<i;j++) {
			if(array[j]>array[j+1]) {
				int temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			}
		}
	}
}
}
