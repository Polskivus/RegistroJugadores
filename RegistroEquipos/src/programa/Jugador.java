package programa;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Jugador {

	private String NombreCompleto;
	private int numeroDorsal;
	private Date fechaNacimiento;
	private Double sueldo;
	
	
	
	public String getNombreCompleto() {
		return NombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		NombreCompleto = nombreCompleto;
	}
	public int getNumeroDorsal() {
		return numeroDorsal;
	}
	public void setNumeroDorsal(int numeroDorsal) {
		this.numeroDorsal = numeroDorsal;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Double getSueldo() {
		return sueldo;
	}
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	
	public void MostrarEnPantalla() {
		System.out.println(this.NombreCompleto+ "\t" +
				this.numeroDorsal+"\t"+
				(new SimpleDateFormat("dd/MM/yyyy").format(this.fechaNacimiento))+"\t"+
				this.sueldo+" €");
	}

	
	
	
}
