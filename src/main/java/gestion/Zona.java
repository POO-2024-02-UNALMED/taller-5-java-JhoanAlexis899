package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public Zona() {
		this(null, null);
	}
	
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	
	public int cantidadAnimales() {
		int contador = 0;
		for (int i = 0; i < animales.size(); i++) {
			if (animales.get(i) instanceof Animal) {contador++;}
		}
		return contador;
	}
	
	public Zoologico getZoo() {
		return this.zoo;
	}
	
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	
	public ArrayList<Animal> getAnimales(){
		return this.animales;
	}
	
	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String s) {
		this.nombre = s;
	}
	

}
