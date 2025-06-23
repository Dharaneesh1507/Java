package csm_pattern;

public class pattern1 {
	public static void main(String[]args){
		int n=3;
		for(int row=1; row<=n; row++){
			for(int col=1; col<= n*2-1; col++){
				if (col<=row||col+row>=n*2)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			
			}
			System.out.println();
		}
	}
}