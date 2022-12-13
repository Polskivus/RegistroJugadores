package ejecutable;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import programa.Equipo;
import programa.Jugador;

public class RegistradorDeEquipos {

	public void run() throws FileNotFoundException, ParseException{
		
		String opc;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce los datos del equipo:");
		
		Equipo equipo = new Equipo();
		
		System.out.println("Introduce el nombre del equipo:");
		equipo.setNombreEquipo(sc.nextLine());
		
		System.out.println("Introduce el estadio en el que se juega");
		equipo.setEstadio(sc.nextLine());
		
		
		
		do {
			
			opcion();
			
			opc = sc.nextLine();
			opc.toLowerCase();
			
			if(opc.equals("J")) {
				
				Jugador jugador = new Jugador();
				
				System.out.println("Introduce el nombre del jugador:");
				jugador.setNombreCompleto(sc.nextLine());
				
				System.out.println("Introduce el numero del jugador");
				jugador.setNumeroDorsal(sc.nextInt());
				
				System.out.println("Introduce la fecha de nacimiento:");
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				jugador.setFechaNacimiento(sdf.parse(sc.nextLine()));
				
				System.out.println("Introduce su sueldo:");
				jugador.setSueldo(sc.nextDouble());
				
				equipo.addJugador(jugador);
				
			}
			
			
		} while (!opc.equals("A"));
		
		
		
	}

	private void opcion() {
		
		System.out.println("Introduce una J si quieres introducir un nuevo jugador.");
		
		System.out.println("O introduce A para archivar el equipo");
		
	}
	
}
