package iNeuron;
import java.util.*;
public class A2SelectionSort {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.print("Enter Array Size: ");   //getting size of array
		int n=s.nextInt();
		
		int[] ar=new int[n];
		System.out.print("Enter Array Elements: ");   //getting array elements
		for(int i=0;i<n;i++) {
			ar[i]=s.nextInt();
		}
		
		for(int i=0;i<n-1;i++) {    //logic for sorting
			int iMin=i;
			for(int j=i+1;j<n;j++) {
				if(ar[j]<ar[iMin])
					iMin=j;
			}
			if(iMin!=i) {
				int temp=ar[iMin];
				ar[iMin]=ar[i];
				ar[i]=temp;
			}
		}
		
		System.out.print("After Sorting:");   //printing in sorted order
		for(int i:ar)
			System.out.print(" "+i);
		
		s.close();
	}
}
