package ArrayfileTask;
import java.io.*;
import java.util.Scanner;
public class NlArray {

	private static final String Desktop = null;

	public static void main(String[] args)  
    {
	    try {
	        //constructor of file class  
	         // java read file 
	        File myFile = new File("C:\\Users\\Hafeez\\Desktop\\new data structure programs\\ArrayfileTask\\src\\ArrayfileTask");
	        // using if statment 
	        if (!Desktop.isDesktopSupported())
	        //check if Desktop is supported by Platform or not  
	        {
	          System.out.println("This is not supported by platform!");
	          return;
	        }
	        Desktop desktop = Desktop.getDesktop();
	        // checking if file exists or not
	        if (myFile.exists())
	        // Opens the file 
	        desktop.open(myFile); 
	      }
	      // catch block to handle any kind of errors
	      catch(Exception e) {
	        System.out.println("Error accurs");
		
    }      
        

