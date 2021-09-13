package Ejercicio01;

public class Asalariado extends Empleado{
	private double sueldo;
	
	public Asalariado(String nombre, int edad, double sueldo) {
		super(nombre, edad);
		this.sueldo= sueldo;
	}
	@Override
	public double calcularPago() {
		return this.sueldo;
	}



	@Override
	public String toString() {
		return "Asalariado ["+ super.getNombre()  + " gana: $" + sueldo + "]";
	}
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	

}
