package iNeuron;

import java.util.*;

public class A2QuickSort {
	static void QuickSort(int[] ar,int start, int end) {  //defining QuickSort Method
		if(start<end) {
			int pIndex=partition(ar,start,end);
			QuickSort(ar,start,pIndex-1);
			QuickSort(ar,pIndex+1,end);
		}
	}
	static int partition(int[] ar,int start,int end) {   //Partition method which sorts
		int pivot=ar[end];   //sorting logic
		int pIndex=start;
		
		for(int i=start;i<end;i++) {
			if(ar[i]<=pivot) {
				int temp=ar[pIndex];
				ar[pIndex]=ar[i];
				ar[i]=temp;
				pIndex++;
			}
		}
		
		int temp=ar[pIndex];
		ar[pIndex]=ar[end];
		ar[end]=temp;
		
		return pIndex;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.print("Enter Array Size: ");   //getting size of array
		int n=s.nextInt();
		
		int[] ar=new int[n];
		System.out.print("Enter Array Elements: ");   //getting array elements
		for(int i=0;i<n;i++) {
			ar[i]=s.nextInt();
		}
		
		QuickSort(ar,0,n-1);    //Calling QuickSort Method for sorting
		
		System.out.print("After Sorting:");    //Printing elements in sorted order
		for(int i:ar)
			System.out.print(" "+i);
		
		s.close();
	}
}
