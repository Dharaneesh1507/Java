package looping;

public class summ {
	public static void main(String[] args) {
		int a=0;
		int b=10;
		int sum=0;
		do {
			sum+=a;
			a++;
		} while (a<=b);
		System.out.println(sum);
	}
}
