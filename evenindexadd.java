package array;

public class evenindexadd {
	public static void main(String[] args) {
		int a[]= {10,15,62,32,7,5};
		int num=0;
		for(int index=0;index<a.length;index++) {
			if(index%2==0) {
				num=num+a[index];
			}
		}
		System.out.println(num);
	}
}
