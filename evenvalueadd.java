package array;

public class evenvalueadd {
	public static void main(String[] args) {
		int a[]= {10,15,62,32,7,5};
		int num=0;
		for(int index=0;index<a.length;index++) {
			if(a[index]%2==0) {
				num=num+a[index];
			}
		}
		System.out.println(num);
	}
}
