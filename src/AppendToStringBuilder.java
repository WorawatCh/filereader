import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AppendToStringBuilder {

	public static String readFileToStringBuilder(String filename){
		InputStream in = null;
		StringBuilder data = new StringBuilder() ;
		try {
			 in = new FileInputStream(filename);
			InputStreamReader reader = new InputStreamReader(in);
			int c;
			while (true) {
				c = reader.read();
				if (c < 0)
					break;
				data = data.append(c);
			}
		}catch (FileNotFoundException e) {
		System.out.println("File not found " + filename);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		if(in != null)try{
			in.close();
		}catch(IOException ex){}
		return data.toString();
	}
	
	public static void show() {
		Stopwatch sw = new Stopwatch();
		sw.start();
		String alice = readFileToStringBuilder("Alice-in-Wonderland.txt");
		sw.stop();
		System.out.printf("Read %d chars in %6f sec.\n",alice.length(),sw.getElapsed());
		
	}
}
