package prog;
class Counter{
	static int count=0;
	int instanceNumber=0;
	Counter(){
		count++;
		instanceNumber++;
	}
	void disp() {
		System.out.println("instanceNumber:"+instanceNumber);
		System.out.println("Static Count:"+count);
	}
}
public class Prog6 {
	public static void main(String[] args) {
		Counter c1=new Counter();
		c1.disp();
		Counter c2=new Counter();
		c2.disp();
		Counter c3=new Counter();
		c3.disp();
	}
}
