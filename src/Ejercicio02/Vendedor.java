package Ejercicio02;

public class Vendedor extends SubContratado {
	
	private double porcentajeComision;

	public Vendedor(String nombre, int edad, int cantHoras, double precioHora, double porcentaje) {
		super(nombre, edad, cantHoras, precioHora);
		this.porcentajeComision = porcentaje;
	}

	@Override
	public double calcularPago() {
		return super.calcularPago() + (super.calcularPago() * this.porcentajeComision);
	}

	@Override
	public String toString() {
		return "Vendedor ["+ super.getNombre() + " gana: $ "+ this.calcularPago() + "]";
	}
	

	

}
