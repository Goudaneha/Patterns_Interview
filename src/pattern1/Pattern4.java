package pattern1;

public class Pattern4 {

	public static void main(String[] args) {
		int n=5;
		for(int row = 0; row<n; row++) {
			for(int col = 0; col<n; col++) {
				if(row==n-1 || col==n-1 || row+col==n-1)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}
