import java.io.File;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		worker w= new worker (new lineNumber());
		File file = new File ("lol.txt");
		
		w.go(file);
	}

}
