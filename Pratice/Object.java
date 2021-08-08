import java.io.FileWriter;
import java.io.IOException;

public class Object {

	//class= System , Math, FileWriter
	//instance = f1
	public static void main(String[] args) throws IOException {

		System.out.println(Math.PI);
		
		FileWriter f1	= new FileWriter("data.txt");
		f1.write("hello");
		f1.write(" java");
		f1.close();
	}
}
