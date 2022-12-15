package ejecutable;

import java.io.FileNotFoundException;
import java.text.ParseException;


public class main {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		
		RegistradorDeEquipos gf = new RegistradorDeEquipos();
		
		gf.run();
		
	}
	
}
