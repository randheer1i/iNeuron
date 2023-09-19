package iNeuron;
import java.util.*;
public class A2MergeSort {
	
	static void MergeSort(int[] ar) {
		int n=ar.length;
		int mid=n/2;
		
		if(n<2)
			return;
		
		int[] left=new int[mid];
		for(int i=0;i<mid;i++)
			left[i]=ar[i];
		
		int[] right=new int[n-mid];
		for(int i=mid;i<n;i++)
			right[i-mid]=ar[i];
		
		MergeSort(left);
		MergeSort(right);
		Merge(left,right,ar);
		
	}
	
	static void Merge(int[] left,int[] right,int[] ar) {
		int l_Len=left.length;
		int r_Len=right.length;
		int i=0,j=0,k=0;
		
		while(i<l_Len && j<r_Len) {
			if(left[i]<=right[j])
				ar[k++]=left[i++];
			else 
				ar[k++]=right[j++];
		}
		
		while(i<l_Len)
			ar[k++]=left[i++];
		
		while(j<r_Len)
			ar[k++]=right[j++];
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Array Size: ");
		int n=s.nextInt();
		
		int[] ar=new int[n];
		System.out.print("Enter Array elements: ");
		for(int i=0;i<n;i++)
			ar[i]=s.nextInt();
		
		MergeSort(ar);
		
		System.out.print("Sorted Array is: ");
		for(int x: ar)
			System.out.print(x+" ");
			
		
		s.close();
	}
}
