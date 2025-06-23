package prog;

public class Prog14 {
	public static void main(String[] args) {
		text("BharathKUMARSUresH");
	}
	public static void text(String str) {
		if(str==null||str.length()<1) return;
		str=str.toLowerCase();
		String res="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(!res.contains(ch+""))res+=ch;
		}
		for(int i=0;i<res.length();i++) {
			char ch=res.charAt(i);
			int count = 0;
			for(int j=0;j<str.length();j++) {
				char ch1=str.charAt(j);
				if(ch==ch1) {count++;}
				
			}
			System.out.println(ch+":"+count);
		}
	}
}
