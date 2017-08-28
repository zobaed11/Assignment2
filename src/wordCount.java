import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;

public class wordCount implements activity {

	@Override
	public void dojob(char[] chararray, String fsa, File string, String keyword) {
		// TODO Auto-generated method stub
		int wcount=0;
		for (int i=0; i<fsa.length();i++)
		{
			/*if(i>0 && chararray[i]== ' ') 
				
				wcount ++;
			
			else if ( i>0 &&chararray[i]== ' ')
			{
				if(chararray[i+1]!= fsa.charAt(fsa.length()))
				{
					wcount++;
				}
			}
			
			else if(i>0 && i+1<fsa.length() && chararray[i]== '\n')
			{
				wcount++;
			}
		*/
			if( ((i>0)&&(chararray[i]!=' ')&&(chararray[i-1]==' ')) || ((chararray[0]!=' ')&&(i==0)) )
			{
				wcount++;
			}
			
			
			
			
		}
		System.out.println("wcount"+ wcount + " " + fsa.length());
		
	}

	

}
