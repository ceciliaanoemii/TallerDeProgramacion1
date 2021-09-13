package Ejercicio03;

public class Heladera extends Electrodomestico {
	public double capacidadLitros;
	public boolean noFrost;
	
	public Heladera(String marca, String modelo, String numSerie, int voltaje, String estado, double precio, double capacidadLts, boolean noFrost) {
		super(marca, modelo, numSerie, voltaje, estado, precio);
		this.capacidadLitros= capacidadLts;
		this.noFrost= noFrost;
	}
	
	public double getCapacidadLitros() {
		return capacidadLitros;
	}
	public void setCapacidadLitros(double capacidadLitros) {
		this.capacidadLitros = capacidadLitros;
	}

	@Override
	public String nombreDelElectrodomestico() {
		return "Heladera";
	}

	@Override
	public String mostrarInfoConPrecio() {
		String heladeraDescrip;
		if(this.noFrost) {
			heladeraDescrip= "No Frost";
		} else {
			heladeraDescrip= "Normal";
		}
		
		return nombreDelElectrodomestico()+ ", "+ getMarca() + ", Modelo: "+ getModelo()+ ", "+heladeraDescrip+ ", Capacidad: "+ this.capacidadLitros+ " litros. Precio: $"+ getPrecio() ;
	}
    
}