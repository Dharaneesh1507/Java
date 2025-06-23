package prog;

public class Prog13 {
	public static void main(String[] args) {
		String name="AbcaBcCA";
		Prog13 p1=new Prog13();
		System.out.println(p1.res(name));
	}
	public String res(String str) {
		str=str.toLowerCase();
		String res="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(!res.contains(ch+""))res+=ch;
		}
		return res;
	}
}
