package Ejercicio04;

public class Television extends Electrodomestico{
	private double pulgadas;
	private boolean esSmart;
	
	public Television(String marca, String modelo, String numSerie, int voltaje, String estado, double precio, double pulgadas, boolean smart ) {
		super(marca, modelo, numSerie, voltaje, estado, precio);
		this.esSmart= smart;
		this.pulgadas= pulgadas;
	}
	
	@Override
	public String nombreDelElectrodomestico() {
		return "Television";
	}

	@Override
	public String mostrarInfoConPrecio() {
	String smartDescrip;
	if(this.esSmart) {
		smartDescrip= "Smart";
		} else {
			smartDescrip= "No Smart";
		}
		return nombreDelElectrodomestico()+" "+ smartDescrip + ", marca: "+getMarca()+ ", modelo: "+ getModelo()+ ", pulgadas: "+ this.pulgadas+ ". Precio: $"+ getPrecio();
	}
	
	
	public double getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}
	public boolean isEsSmart() {
		return esSmart;
	}
	public void setEsSmart(boolean esSmart) {
		this.esSmart = esSmart;
	}


}
