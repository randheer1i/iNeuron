package iNeuron;
import java.util.*;
public class A2SubsetArray {
	
	static boolean subSet(int[] ar1,int[] ar2) {
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<ar1.length;i++)
			hs.add(ar1[i]);
		
		for(int i=0;i<ar2.length;i++) {
			if(hs.contains(ar2[i]))
				continue;
			else 
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Array size: ");
		int n1=s.nextInt();
		
		int[] ar1=new int[n1];
		System.out.print("Enter Array Elements: ");
		for(int i=0;i<n1;i++)
			ar1[i]=s.nextInt();
		
		int n2;
		System.out.print("Enter size of Array: ");
		while(true) {
			n2=s.nextInt();
			if(n2<=n1)
				break;
			else System.out.print("**Oops!! Wrong Input.**\nEnter size <= size of 1st array: ");
		}
		
		int[] ar2=new int[n2];
		System.out.print("Enter Array Elements: ");
		for(int i=0;i<n2;i++)
			ar2[i]=s.nextInt();
		
		if(subSet(ar1,ar2))
			System.out.print("Given Array is SubSet of another Array");
		else System.out.print("**Oops!! Given Array is not SubSet of another Array**");
		
		s.close();
	}
}
