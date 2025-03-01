package learningFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileExample {
  public static void main(String args[]) {
	  
	  //1.Create a file
	  
	 try {
		 File file = new File("exmple.txt");
		 if(file.createNewFile()) {
			 System.out.println("File created "+file.getName());
		 }else {
			 System.out.println("File already exist");
		 }
		 
	 }
	 catch(IOException e) {
		 System.out.println("An error occured");
		 e.printStackTrace();
	 }
	 
	 
	 
	 //2.Write a file
	 
	try(FileWriter writer = new FileWriter("exmple.txt")){
		writer.write("Hello, this is a sample text file.\n");
		writer.write("Java file handling is fun!");
		System.out.println("Successfully written to the file.");
			}
  catch(IOException e) {
	  System.out.println("An error occurred while writing to the file.");
      e.printStackTrace();
  }
	
	//3.Read from the file
	
	try(BufferedReader reader = new BufferedReader(new FileReader("exmple.txt"))){
		String line;
		while((line=reader.readLine()) !=null) {
			System.out.println(line);
		}
	}catch(IOException e) {
		System.out.println("An error occured while reading the file");
		e.printStackTrace();
	}
	
	 // 4. Append to the file
    try (FileWriter writer = new FileWriter("exmple.txt", true)) { // 'true' enables append mode
        writer.write("\nThis line is appended.");
        System.out.println("Successfully appended to the file.");
    } catch (IOException e) {
        System.out.println("An error occurred while appending to the file.");
        e.printStackTrace();
    }
	
 // 5. Delete the file
    File file = new File("exmple.txt");
    if (file.delete()) {
        System.out.println("Deleted the file: " + file.getName());
    } else {
        System.out.println("Failed to delete the file.");
    }
    
    
  }

}
