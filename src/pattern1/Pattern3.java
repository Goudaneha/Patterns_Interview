package pattern1;

public class Pattern3 {

	public static void main(String[] args) {
		int n=5;
		for(int row =0; row<n; row++) {
			for(int col=0; col<n; col++) {
				if(
				row!=0   && row!=n-1 && col==0 /******print 3 vertical star****/
				|| col==n/2 && row!=n/2
				|| row==n/2 && col==n-1
				|| col==n/3 && row!=0 && row!=n-1 && row!=n/2
				|| row==n/3 && col!=0 && col!=n-1
				|| row+col==n+1
				//or we can use this line|| col!=n/2 && row!=0 && row!=n-1 && row!=n/2 && col!=n-1 && row+col!=n-1 && col!=0 
			 ) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

}
