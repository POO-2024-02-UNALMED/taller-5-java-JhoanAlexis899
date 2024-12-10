package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil( String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		Reptil.listado.add(this);
	}
	
	public Reptil() {
		this(null, 0, null, null, null, 0);
	}
	
	public static int cantidadReptiles() {
		int contador = 0;
		for (int i = 0; i < listado.size(); i++) {
			if (listado.get(i) instanceof Reptil) {contador++;}
		}
		return contador;
	}
	public String movimiento() {
		return "reptar";
	}
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil.iguanas++;
		return new Reptil(nombre, edad, "humedal",genero,"verde",3);
		
	}
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil.serpientes++;
		return new Reptil(nombre, edad, "jungla",genero,"blanco",1);
	}
	
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	
	public void setColorEscamas(String s) {
		this.colorEscamas = s;
	}
	
	public int getLargoCola() {
		return this.largoCola;
	}
	
	public void setLargoCola(int j) {
		this.largoCola = j;
	}
	
}