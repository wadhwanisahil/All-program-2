package Happy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class fileRader {

	private static final String Desktop = null;

	public static void main(String[] args) throws IOException {
		String fileName = "C:\\Users\\Hafeez\\Desktop\\LC.txt";
		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		//BufferedReader br = new BufferedReader(fr);
	//	String line;
		//while((line = br.readLine()) != null){
		    //process the line
		  //  System.out.println(line);
	//	} 
		Scanner sc=new Scanner(fr);
		String[] h=new String[20];
		//String token;
		int i=0;
		while(sc.hasNext()) {
		// h[i]=sc.next();
			
		 token.replaceAll("C:\\\\Users\\\\Hafeez\\\\Desktop\\\\LC.txt", ",");
		 h[i]=sc.next();
		 i++;
		}
	
	}
}
