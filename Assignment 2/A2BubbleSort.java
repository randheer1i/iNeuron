package iNeuron;
import java.util.*;
public class A2BubbleSort {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Array Size: ");   //getting array size
		int n=s.nextInt();
		
		int[] ar=new int[n];
		System.out.print("Enter Array Elements: ");  //getting array elements
		for(int i=0;i<n;i++) {
			ar[i]=s.nextInt();
		}
		
		for(int i=0;i<n;i++) {   //logic for sorting
			boolean flag=true;
			for(int j=0;j<n-i-1;j++) {
				if(ar[j]>ar[j+1]) {
					flag=false;
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
			if(flag==true)
				break;
		}
		
		System.out.print("After Sorting:");   //printing in sorted order
		for(int i:ar)
			System.out.print(" "+i);
		
		s.close();
	}
}
