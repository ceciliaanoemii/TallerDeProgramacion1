package Ejercicio04;

public abstract class Electrodomestico implements Imprimible {
	private String marca;
	private String modelo;
	private String numSerie;
	private int voltaje;
	private String estado;
	private double precio;

	public Electrodomestico(String marca, String modelo, String numSerie, int voltaje, String estado, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.numSerie = numSerie;
		this.voltaje = voltaje;
		this.estado = estado;
		this.precio = precio;
	}

	public String mostrarInfo() {
		return nombreDelElectrodomestico() + " " + this.marca + " " + this.modelo;
	}

	public abstract String nombreDelElectrodomestico();

	public abstract String mostrarInfoConPrecio();

	public void imprimir() {
		System.out.println(mostrarInfoConPrecio());
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public int getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
