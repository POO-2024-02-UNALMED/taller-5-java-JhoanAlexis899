package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		Pez.listado.add(this);
	}
	
	public Pez() {
		this(null, 0, null, null, null, 0);
	}
	
	public static int cantidadPeces() {
		int contador = 0;
		for (int i = 0; i < listado.size(); i++) {
			if (listado.get(i) instanceof Pez) {contador++;}
		}
		return contador;
	}
	public String movimiento() {
		return "nadar";
	}
	public static Pez crearSalmon(String nombre, int edad,String genero) {
		Pez.salmones++;
		return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
	}
	public static Pez crearBacalao(String nombre, int edad,String genero) {
		Pez.bacalaos++;
		return new Pez(nombre, edad, "oceano", genero, "gris", 6);
	}
	
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	
	public void setColorEscamas(String s) {
		this.colorEscamas = s;
	}
	
	public int getCantidadAletas() {
		return this.cantidadAletas;
	}
	
	public void setLargoCola(int j) {
		this.cantidadAletas = j;
	}
	

}