package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckGivenNumGreaterThanArrayElement {

	
	public static boolean doesHaveElementGreaterThan(int[] arr,int num){
		if(arr.length==0) {
			return false;
		}
		for(int arr1:arr) {
		if(arr1>num) {
			return true;
		}
		}
		return false;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		}
		int num=sc.nextInt();
		
		boolean res=doesHaveElementGreaterThan(arr,num);
		System.out.println(res);
		sc.close();
	}
}
