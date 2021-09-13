package Ejercicio03;

public class Lavarropa extends Electrodomestico{
	
	private double cargaMaxima;
	private boolean automatico;
	
	public Lavarropa(String marca, String modelo, String numSerie, int voltaje, String estado, double precio, double cargaMaxima, boolean automatico) {
	super(marca, modelo, numSerie, voltaje, estado, precio);
	this.cargaMaxima= cargaMaxima;
	this.automatico= automatico;
	}
	@Override
	public String nombreDelElectrodomestico() {
		return "Lavarropa";
	}
	
	@Override
	public String mostrarInfoConPrecio() {
		String lavDescrip;
		if(this.automatico) {
			lavDescrip="Automaticco";
			}else {
				lavDescrip=" Semi Automatico";
			}
		return nombreDelElectrodomestico()+", "+ lavDescrip + ", Carga maxima: "+ this.cargaMaxima+ ", modelo: "+getModelo()+ ". Precio: $" + getPrecio() ;
	}
	
	
	public double getCargaMaxima() {
		return cargaMaxima;
	}
	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	public boolean isAutomatico() {
		return automatico;
	}
	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}

	

}
