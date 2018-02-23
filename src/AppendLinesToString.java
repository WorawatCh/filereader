import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class AppendLinesToString {

	public static String readFileToBufferedReader(String filename) {
		InputStream in = null;
		FileReader read = null;
		try {
			read = new FileReader(filename);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		BufferedReader data = new BufferedReader(read);
		String result = "";
		String line;
		try {
			in = new FileInputStream(filename);
			InputStreamReader reader = new InputStreamReader(in);
			int c;
			while ((line = data.readLine()) != null) {
				c = reader.read();
				if (c < 0)
					break;
				result = result + line + '\n';
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found " + filename);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		if (in != null)
			try {
				in.close();
			} catch (IOException ex) {
			}
		return result;

	}
	
	public static void show() {
		Stopwatch sw = new Stopwatch();
		sw.start();
		String alice = readFileToBufferedReader("Alice-in-Wonderland.txt");
		sw.stop();
		System.out.printf("Read %d chars in %6f sec.\n",alice.length(),sw.getElapsed());
		
	}

}
