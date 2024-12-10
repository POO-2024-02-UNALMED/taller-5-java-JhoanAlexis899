package zooAnimales;
import gestion.Zona;

public class Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}
	
	public Animal() {
		this(null, 0, null, null);
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	public static String totalPorTipo() {
		String mamiferos = String.valueOf(Mamifero.cantidadMamiferos());
		String aves = String.valueOf(Ave.cantidadAves());
		String reptiles = String.valueOf(Reptil.cantidadReptiles());
		String peces = String.valueOf(Pez.cantidadPeces());
		String anfibios = String.valueOf(Anfibio.cantidadAnfibios());
		return "Mamiferos: "+ mamiferos +"\n"
				+"Aves: "+aves + "\n"
				+ "Reptiles: " +reptiles + "\n"
				+"Peces: " + peces + "\n"
				+"Anfibios: " + anfibios;
	}
	public String toString() {
		if(this.zona == null) {
			return "Mi nombre es "+ this.nombre +", tengo una edad de "+ this.edad +", habito en "+this.habitat
					+" y mi genero es " + this.genero;
		}
		return "Mi nombre es "+ this.nombre +", tengo una edad de "+ this.edad + ", habito en "+this.habitat+
				" y mi genero es " + this.genero + ", la zona en la que me ubico es " + this.zona.getNombre() + ", en el zoo "  + this.zona.getZoo().getNombre();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String s) {
		this.nombre = s;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int j) {
		this.edad = j;
	}
	
	public String getHabitat() {
		return this.habitat;
	}
	
	public void setHabitat(String s) {
		this.habitat = s;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public void setGenero(String s) {
		this.genero = s;
	}
	
	public Zona getZona() {
		return this.zona;
	}
	
	public void setZona(Zona zona){
		this.zona = zona;
	}
	
	public int getTotalAnimales() {
		return this.totalAnimales;
	}
	
	public void setTotalAnimales(int j) {
		this.totalAnimales = j;
	}
}