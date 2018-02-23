
public class Main {

	public static void main(String[] args) {
		System.out.println("Reading Alice-in-Wonderland.txt using FileReader, append to String.");
		AppenToString.show();
		System.out.println("Reading Alice-in-Wonderland.txt using FileReader, append to StringBuilder.");
		AppendToStringBuilder.show();
		System.out.println("Reading Alice-in-Wonderland.txt using BufferedReader, append lines to String.");
		AppendLinesToString.show();
	}
}
