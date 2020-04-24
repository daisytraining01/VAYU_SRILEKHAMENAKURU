package Java_Pac;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ReadTextFile {
      BufferedReader in; 
		String read; 
		int linenum =12;


		public ReadTextFile(){ 
		try { 
		in = new BufferedReader(new FileReader("C:\\Users\\srilekham\\Desktop\\Ass_Test.txt")); 

		for (linenum=0; linenum<20; linenum++) {

		    read = in.readLine();
		    if(read==null){} 
		    else{
		        System.out.println(read);  
		    }
		    in.readLine ();
		}
		}catch(IOException e){
			System.out.println("There was a problem:" + e); 
		}
		}
		
	public static void main(String[] args) throws FileNotFoundException {	

		ReadTextFile s= new ReadTextFile();
	}
}

/*Output:
	file content:
		This is fine
		this id
		 this 
		srilekha
		
		output:
			This is fine
			 this 	*/
			
