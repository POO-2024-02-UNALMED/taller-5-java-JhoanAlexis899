package zooAnimales;

public class Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona[] zona;
	
	public Animal() {}
	
	public Animal(int total, String nombre, int edad, String habitat, String genero, Zona[] zona) {
		totalAnimales = total;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
	}
	

}
