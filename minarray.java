package array;

public class minarray {
	public static void main(String[] args) {
		int a[]= {9,9,10,9,9,9,9};
		System.out.println(secmin(a));
	}
	public static int secmin(int a[]){
		if(a==null || a.length==0) return -1;
		int min=a[0]; int secmin=Integer.MAX_VALUE;
		for (int i=1;i<a.length;i++) {
			if(a[i]<min) {
				secmin=min;
				min=a[i];
			}else if(a[i]>min && a[i]<secmin) {
				secmin=a[i];
			}
		}
		int res=(secmin == Integer.MAX_VALUE) ? -1: secmin;
		return res;
	}

}
