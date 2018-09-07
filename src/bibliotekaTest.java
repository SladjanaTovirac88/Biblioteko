

public class bibliotekaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pisanje fajl1=new pisanje();
		fajl1.otvoriFajl();
		fajl1.dodajTekst();
		
		
		citanje fajl2=new citanje();
		fajl2.otvoriFajl();
		fajl2.procitajFajl();

	}

}


