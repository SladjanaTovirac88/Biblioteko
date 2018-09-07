import java.io.File;
import java.util.Scanner;

public class citanje {
private Scanner input;
	
	public void otvoriFajl(){
		try{
		 input=new Scanner(new File("biblio.txt"));
		
		}
		catch(Exception e){
			System.out.println("Ne mozemo pronaci fajl!");
		}
	}
		public void procitajFajl(){
			while(input.hasNext()){
				String rijec1=input.next();
				String rijec2=input.next();
				String rijec3=input.next();
				String rijec4=input.next();
				String rijec5=input.next();
				String rijec6=input.next();
				System.out.println(rijec1+" "+rijec2+" "+ rijec3
						+" "+rijec4+" "+rijec5+" "+rijec6);
			}	
			

		input.close();
			
			
		
		
		}



		}















	







