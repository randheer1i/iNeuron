package iNeuron;

public class PatternAssignment4 {
	public static void main(String[] args) {
		int n=14;   
		System.out.println();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i-j>=(n-2)/2 || j+i>=(n)+(n-2)/2 -1 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
