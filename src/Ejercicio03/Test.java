package Ejercicio03;
import java.util.ArrayList;
import java.util.Scanner;


public class Test {
	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<Electrodomestico> electrodomesticos= cargarDatos();		
		ArrayList<Electrodomestico> seleccionados = seleccionarElectrodomesticos(electrodomesticos); 
		mostrarTicket(seleccionados);
		
		
		
	}
	
	public static ArrayList<Electrodomestico> cargarDatos(){
	System.out.println("Cargando lista de electrodomesticos: ");
	ArrayList<Electrodomestico> electrodomesticos= new ArrayList<>();
	Heladera hel= new Heladera("Whirlpool", "H2745", "ADRE34", 220, "Nuevo", 14999, 250, false);
	Television tel= new Television("Philips", "C34TE", "49PGFS", 140, "Nuevo", 14370, 49, true);
	Lavarropa lav= new Lavarropa("Drean", "CONCEPT 5.05", "c505", 245, "Nuevo", 6799, 6, false);
	Licuadora lic = new Licuadora("Patrick", "LQ3D", "AA3DF", 220, "Nuevo", 20000, 900, 3);
	electrodomesticos.add(hel);
	electrodomesticos.add(tel);
	electrodomesticos.add(lav);
	electrodomesticos.add(lic);
	
	return electrodomesticos;
	}
	
	public static void mostrarListaAlUsuario(ArrayList<Electrodomestico> lista) {
		int posicion= 1;
		for (Electrodomestico electrodomestico : lista) {
			System.out.println(posicion + "-" + electrodomestico.mostrarInfo());
			posicion++;	
		}
	}
	public static ArrayList<Electrodomestico> seleccionarElectrodomesticos (ArrayList<Electrodomestico> lista){
	ArrayList<Electrodomestico> productosSeleccionados= new ArrayList<>();
	int opcion= -20;
	
	System.out.println("Bienvenido! ");
	while( opcion != 0) {
		System.out.println("Seleccione un producto o 0 para finalizar: ");
		mostrarListaAlUsuario(lista);
		opcion= entrada.nextInt();
			
		if(opcion != 0) {
			if(opcion > lista.size()) {
				System.out.println("Electrodomestico no valido");			
					}else {
						Electrodomestico productoElegido= lista.get(opcion-1); //Porque pusimos que el indice empieza en 1 pero en realidad es en CERO
						if (confirmarProducto(productoElegido)) {
						productosSeleccionados.add(productoElegido);
					}				
			}			
		}
	}	
	return productosSeleccionados;
	}

	public static boolean confirmarProducto (Electrodomestico electro) {
		boolean resultado= false;
		System.out.println("Producto seleccionado: "+ electro.mostrarInfo());
		System.out.println("Desea confirmar? S/N");
		char opcion = entrada.next().charAt(0);
		
		while(opcion != 'S'&& opcion != 'N') {
			System.out.println("Ingreso una opcion incorrecta");
			System.out.println("Desea confirmar? S/N");
			opcion = entrada.next().charAt(0);	
		}
		if(opcion == 'S') {
			resultado=true;
		}
		return resultado;
	}
	
	public static void mostrarTicket(ArrayList<Electrodomestico>seleccionados) {
	double total= 0;
	System.out.println("Ticket de venta ");
	System.out.println("Articulos: ");
	
	for (Electrodomestico e : seleccionados) {
		System.out.println(e.mostrarInfoConPrecio());
		total= total + e.getPrecio();	
		}
	System.out.println("Total: $"+ total);
	}
}
