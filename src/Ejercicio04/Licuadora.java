package Ejercicio04;

public class Licuadora extends Electrodomestico {
	private double potenciaWatts;
	private int cantVelocidades;
	
	public Licuadora(String marca, String modelo, String numSerie, int voltaje, String estado, double precio, double potenciaWatts, int cantVelocidades) {
		super(marca, modelo, numSerie, voltaje, estado, precio);
		setCantVelocidades(cantVelocidades);
		setPotenciaWatts(potenciaWatts);
	}
	@Override
	public String nombreDelElectrodomestico() {
		return "Licuadora";
	}
	
	@Override
	public String mostrarInfoConPrecio() {
		return nombreDelElectrodomestico()+", modelo:  "+getModelo()+", potencia:  "+ this.potenciaWatts + ", Cantidad de velocidades: "+ this.cantVelocidades+ ". Precio: $"+ getPrecio();
	}
	
	
	public double getPotenciaWatts() {
		return potenciaWatts;
	}
	public void setPotenciaWatts(double potenciaWatts) {
		this.potenciaWatts = potenciaWatts;
	}
	public int getCantVelocidades() {
		return cantVelocidades;
	}
	public void setCantVelocidades(int cantVelocidades) {
		this.cantVelocidades = cantVelocidades;
	}

	
	

}
