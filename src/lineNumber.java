import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class lineNumber implements activity {



	public void dojob(char [] chararray, String st, File string, String Keyword)  {
		int count =0;
				//System.out.println(file.length());
				for (int i=0; i<st.length();i++)
				 {
					 
					 
					 if (chararray[i]=='\n') count++; 
				 } 
					System.out.println(count);

			} 
			
		 
		 
		
		/*char[] c = new char[1024];
			 int count = 0;
			 int letter=0;
			 for (int i=0; i<=file.length();i++)
			 {
				 
				 
				 if (fsa[i]=='\n') count++; 
			 } *///System.out.println( "  " + file.length());
			 
		  
	}
	

