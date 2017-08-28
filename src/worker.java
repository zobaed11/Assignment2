import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class worker {

	private activity act;
	private String keyword;
	
	public worker (activity act)
	{
		this.act=act;
	}
	
	public void changeworker (activity act)
	{
		this.act=act;
	}
	public void changeworker (activity act, String s)
	{
		this.act=act;
		this.keyword=s;
	}
	
	public void go(File string, String keyword)
	{
		InputStream is = null;
		try {
			is = new FileInputStream (string);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		BufferedReader buf = new BufferedReader(new InputStreamReader(is));
		try {
			String line=buf.readLine();
			StringBuilder sb= new StringBuilder();
			while(line != null){
				   sb.append(line).append("\n");
				   line = buf.readLine();
				}
				  
			String fsa=sb.toString();
			char a[]= fsa.toCharArray();
			
		act.dojob(a, fsa, string, keyword);
		
			
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

	
}
	
