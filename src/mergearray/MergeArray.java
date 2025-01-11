// package mergearray;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1array size: ");
//		array creation
		int[] arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter 2array size: ");
		int[] brr=new int[sc.nextInt()];
		for(int i=0;i<brr.length;i++) {
			brr[i]=sc.nextInt();
		}
		//merge array creation 
		int[] crr=new int[arr.length+brr.length];
		for(int i=0;i<crr.length;i++) {
			if(i>=0&&i<arr.length) {
				crr[i]=arr[i];
			}else {
				crr[i]=brr[i-arr.length];
			}
		}
		for(int i=0;i<crr.length;i++) {
			System.out.println(crr[i]);
		}
	}
}
