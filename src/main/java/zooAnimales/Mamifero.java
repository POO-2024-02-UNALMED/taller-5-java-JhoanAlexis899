package zooAnimales;
import java.util.ArrayList;
public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		Mamifero.listado.add(this);
	}
	
	public Mamifero() {
		this(null, 0, null, null, false, 0);
	}
	
	
	public static int cantidadMamiferos() {
		int contador = 0;
		for (int i = 0; i < Mamifero.listado.size(); i++) {
			if (Mamifero.listado.get(i) instanceof Mamifero) {contador++;}
		}
		return contador;
	}
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero.caballos++;
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);
	}
	public static Mamifero crearLeon(String nombre, int edad, String genero) { 
		Mamifero.leones++;
		return new Mamifero(nombre, edad,"selva",genero, true,4);	
	}
	
	public boolean isPelaje() {
		return this.pelaje;
	}

	public void setPelaje(boolean s) {
		this.pelaje = s;
	}
	
	public int getPatas() {
		return this.patas;
	}
	
	public void setPatas(int j) {
		this.patas = j;
	}
}