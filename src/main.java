import java.io.File;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File (args[0]);
		String s = args[1];
		worker w= new worker (new lineNumber());
		
		
		w.go(file,s);
		
		w.changeworker(new wordCount());
		
		w.go(file,s);
		w.changeworker(new grab());
		w.go(file,s);
	}

}
