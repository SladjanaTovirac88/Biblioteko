import java.io.PrintWriter;

public class pisanje {
	 PrintWriter output;
		
	 public void otvoriFajl(){
		 try{
			 output=new PrintWriter("biblio.txt");
		 
		 }catch(Exception e){
			 System.out.println("Postoji greska!");
		 }	 
	 }
	public void dodajTekst() {
		output.print("Dobrodosli u biblioteku! ");
		output.print("Koju opciju zelite?");
		
		
		output.close();
	
	
	}
		 
		 
		 
		 
		 
		 
		 














}




