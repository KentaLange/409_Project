import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;
	import java.io.File;
	import java.io.IOException;
	
public class FileReader {
	

	CNF test=null;
	public FileReader(String input) {
		
		String storage=GetAllBytes(input);
		test=new CNF(storage);
		//System.out.println(test.toString());
	}
	//returns CNF that contains String file
	public CNF getCNF() {
		return test;
	}
	
	//You can call CNF if u want.
	public static void main(String[] args) {
		try {
				CNF temp = new CNF(args[0]);
				//temp.lex.Lex();
				//System.out.println(temp.toString());
			} catch (Exception e) {
			     System.out.println(e);
            }
			
	}
			
		
		
		//converts a file into String
		public String GetAllBytes(String file){
			
			Path myPath = Paths.get(file);
			String content="";
			try {
				content = new String(Files.readAllBytes (myPath));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return content;
		}
	}
		



