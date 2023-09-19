package iNeuron;
import java.util.*;
public class A2DublicateElements {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean flag=true;
		System.out.print("Enter Array Size: ");   //getting size
		int n=s.nextInt();
		
		int[] ar=new int[n];
		System.out.print("Enter Array Elements: ");   //getting elements
		for(int i=0;i<n;i++) {
			ar[i]=s.nextInt();
		}
		
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<n;i++) {        //logic for finding duplicates
			if(hs.add(ar[i])==false) {
				if(flag==true) {
					System.out.print("Dublicate Elements are:");
					flag=false;
				}
				System.out.print(" "+ar[i]);  //printing duplicate elements
			}
		}
		
		if(flag==true)
			System.out.print("No Duplicates found");
		
		s.close();
	}
}
