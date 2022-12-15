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
		
		int opc2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce los datos del equipo\n");
		
		Equipo equipo = new Equipo();
		
		System.out.println("Introduce el nombre del equipo:");
		equipo.setNombreEquipo(sc.nextLine());
		
		System.out.println("Introduce el estadio en el que se juega");
		equipo.setEstadio(sc.nextLine());
		
		
		
		do {
			
			opcion();
			
			opc = sc.nextLine();
			
			if(opc.equals("J")) {
				
				Jugador jugador = new Jugador();
				
				System.out.println("\nIntroduce el nombre del jugador:");
				jugador.setNombreCompleto(sc.nextLine());
				
				System.out.println("\nIntroduce el numero del jugador");
				jugador.setNumeroDorsal(Integer.parseInt(sc.nextLine()));
				
				System.out.println("\nIntroduce la fecha de nacimiento:");
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				jugador.setFechaNacimiento(sdf.parse(sc.nextLine()));
				
				System.out.println("\nIntroduce su sueldo:");
				jugador.setSueldo(Double.parseDouble(sc.nextLine()));
				
				equipo.addJugador(jugador);
				
			}
			
			
		} while (!opc.equals("A"));
		
		equipo.mostrarEnPantalla();
		
		System.out.println("-------------------------------------------");
		System.out.println("\nDime que es lo que quieres hacer con la info: Guardar (1) o Salir (0)");
		
		
		
		do {

			 opc2 = Integer.parseInt(sc.nextLine());
			
			switch (opc2) {
			case 1: 
				
				
				
				break;
			
			case 0:
			
				System.exit(0);
				
				
				break;
				
				
			default:
				System.out.println("Por favor introduce un valor valido.");
				
				break;
			}
		}while(opc2 != 0 || opc2 != 1);

		
	}

	private void opcion() {
		
		System.out.println("Introduce una J si quieres introducir un nuevo jugador.");
		
		System.out.println("O introduce A para archivar el equipo");
		
	}
	
}
