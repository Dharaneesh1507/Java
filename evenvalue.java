package array;

public class evenvalue {
	public static void main(String[] args) {
		int a[]= {10,15,62,32,7,5};
		for(int index=0;index<a.length;index++) {
			if(a[index]%2==0) {
				System.out.println(a[index]);
			}
		}
	}
}
