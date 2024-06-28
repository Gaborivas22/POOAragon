package fes.aragon.modelo;

import java.util.ArrayList;
import java.util.Arrays;

public class Hotel {
	private Gerente gerente=new Gerente();
	private ArrayList<Habitacion> habitaciones=new ArrayList<>();
	private String nombre;
	private String direccion;
	private String correo;
	private String telefono;
	private static Hotel instancia=new Hotel();
	private Hotel() {
		
	}
	public static Hotel getHotel() {
	    return instancia;
	}
	public Gerente getGerente() {
		return gerente;
	}
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	
	public ArrayList<Habitacion> getHabitaciones() {
		return habitaciones;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Hotel [gerente=" + gerente + ", habitaciones=" + habitaciones + ", nombre=" + nombre
				+ ", direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + "]";
	}
	
}
