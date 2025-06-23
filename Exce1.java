package Exception;

public class Exce1 {
	public static void dicide(int num,int deno) {
		int i=20;
		i=i+30;
		System.out.println(i);
		try {
			int result=num/deno;
			System.out.println(result);
		}
		catch(Exception e) {
			System.out.println("Cannot divide by zero");
		}
		finally {
			System.out.println("hi");
		}
	}
	public static void main(String[] args) {
		int num=10;
		int deno=0;
		dicide(num,deno);
		
	}
}
