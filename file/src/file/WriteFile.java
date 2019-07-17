package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class WriteFile {
	public static void write() throws FileNotFoundException 
	{
		PrintStream p= new PrintStream(new File("b.txt"));
		p.append("abc\n");
		p.append("ha kadima");
	}

	public static void main(String[] args) throws FileNotFoundException {
		WriteFile.write();
	}

}
