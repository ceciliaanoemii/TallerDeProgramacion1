package Ejercicio04;

import java.util.ArrayList;

public class Ticket implements Imprimible {
	private ArrayList<Electrodomestico> productos;

	public Ticket() {
		this.productos = new ArrayList<>();
	}

	public void agregarProducto(Electrodomestico elec) {
		this.productos.add(elec);
	}

	@Override
	public void imprimir() {
		double total = 0;
		System.out.println("****Ticket de Venta****");
		System.out.println("Articulos: ");
		for (Electrodomestico e : this.productos) {
			e.imprimir();
			total = total + e.getPrecio();
		}
		System.out.println("Total: $" + total);
	}

}
