package Ejercicio01;

public class SubContratado extends Empleado {
	private int canthoras;
	private double precioHora;
	
	public SubContratado(String nombre, int edad, int cantHoras, double precioHora) {
		super(nombre, edad);
		this.canthoras= cantHoras;
		this.precioHora= precioHora;
	}

	@Override
	public double calcularPago() {
		return this.canthoras * this.precioHora;
	}

	public int getCanthoras() {
		return canthoras;
	}

	public void setCanthoras(int canthoras) {
		this.canthoras = canthoras;
	}

	public double getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}

	@Override
	public String toString() {
		return "SubContratado [" + super.getNombre() + " gana: $" + this.calcularPago()+ "]";
	}
	

	

}
