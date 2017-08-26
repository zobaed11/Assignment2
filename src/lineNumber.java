import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class lineNumber implements activity {



	public void dojob(File file)  {
		try { int count=0;
			InputStream is = new FileInputStream (file);
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			try {
				String line=buf.readLine(); StringBuilder sb= new StringBuilder();
				while(line != null){
					   sb.append(line).append("\n");
					   line = buf.readLine();
					}
					  
				String fsa=sb.toString();
				char a[]= fsa.toCharArray();
				//System.out.println(file.length());
				for (int i=0; i<=file.length();i++)
				 {
					 
					 
					 if (a[i]=='\n') count++; 
				 } 
					System.out.println(count);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		/*char[] c = new char[1024];
			 int count = 0;
			 int letter=0;
			 for (int i=0; i<=file.length();i++)
			 {
				 
				 
				 if (fsa[i]=='\n') count++; 
			 } *///System.out.println( "  " + file.length());
			 
		  
	}
	
}
