package Exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Exce2 {
	public static void main(String[] args) throws FileNotFoundException{
		File file=new File("c:\\path");
		FileReader fr=new FileReader(file);
		System.out.println(fr);
	}
}
