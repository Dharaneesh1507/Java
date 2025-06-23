package prog;

public class prog2 {
	public static void main(String[] args) {
		String[] batch1={"apple","banana"};
		String[] batch2= {"banana","mango"};
		String[] totalbatch= new String[batch1.length+batch2.length];
		for(int i=0;i<batch1.length;i++) {
			totalbatch[i]=batch1[i];
			int j=i+batch1.length;
			totalbatch[j]=batch2[i];
		}
		for(int i=0;i<batch1.length;i++) {
			if(totalbatch[i]!=null) {
			System.out.println(totalbatch[i]);}
		}
		for(int i=0;i<totalbatch.length;i++) {
			for(int j=i+1;j<totalbatch.length;j++) {
				if(totalbatch[j].equals(totalbatch[i])) {
					totalbatch[i]=null;
				}
			}
		}
		for(int i=0;i<batch1.length;i++) {
			if(totalbatch[i]!=null) {
			System.out.println(totalbatch[i]);}
		}
	}
}
