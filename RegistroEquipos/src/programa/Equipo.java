package programa;

import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class Equipo {

	private String nombreEquipo;
	private String estadio;
	
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	
	public void addJugador(Jugador jugador) {
		jugadores.add(jugador);
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	public void mostrarEnPantalla() {
		System.out.println("El quipo es: "+this.nombreEquipo);
		for(Jugador jugador : this.jugadores) {
			jugador.MostrarEnPantalla();
		}
	}
	
	
}
