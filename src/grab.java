import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class grab implements activity{

	
	/*public grab(String keyword) {
		// TODO Auto-generated constructor stub
	this.keyword = keyword;
	}
*/
	@Override
	public void dojob(char[] chararray, String fsa, File string, String keyword) {
		System.out.println("grab");
		// TODO Auto-generated method stub
		
	String s;
		
		   int count =0;
		   InputStream is = null ;try {
				is = new FileInputStream (string);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
		  
		/* it seems redundant to initialize bufferedReader again. I tried to pass buffered reader parameter here. But it cannot bring its value.
		 
		 */
		  
		   try {
			while ((s=buf.readLine())!=null){
			      if(s.contains(keyword))
			      {
			    	  count++;
			      }
			   }System.out.println( keyword +" is found " + count + " times");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}                                                                             
		   }
		
	}

	

