package fileHandling;
import java.util.*;
import java.io.*;
public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String file, text, data;
		
		Scanner scan = new Scanner(System.in);
		
		// Writes a File
		System.out.println("Enter the name of the file: ");
		file = scan.nextLine();
		
		FileWriter fw = new FileWriter(file);
		System.out.println("Enter the text to write in the file: ");
		text = scan.nextLine();
		
		fw.write(text);
		fw.close();
		System.out.println("File Successfully Written! ");
		
		// Appends a File
		System.out.println("Enter the name of the file: ");
		file = scan.nextLine();
		fw = new FileWriter(file, true);
		System.out.println("Enter the new text to append in the file: ");
		text = scan.nextLine();
				
		fw.write(text);
		fw.close();
		System.out.println("File Successfully Appended! ");
		
		
		// Reads a File
		System.out.println("Contents in the given file to read: ");
		File file1 = new File("NewFile.txt");
		Scanner scan1 = new Scanner(file1);
		while (scan1.hasNextLine()) {
			data = scan1.nextLine();
			System.out.println(data);
		}
		System.out.println("File Successfully Read! ");
		scan.close();
		scan1.close();
	}

}