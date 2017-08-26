import java.io.File;

public class worker {

	private activity act;
	
	public worker (activity act)
	{
		this.act=act;
	}
	
	public void changeworker (activity act)
	{
		this.act=act;
	}
	
	public void go(File string)
	{
		act.dojob(string);
		
			
	}
}
	
