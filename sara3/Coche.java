package sara3;

public class Coche {
	private String modelo,nombre;
	private int peso;
	public Coche(String modelo, String nombre, int peso) {
		super();
		this.modelo = modelo;
		this.nombre = nombre;
		this.peso = peso;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", nombre=" + nombre + ", peso=" + peso + "]";
	}
	
	
}
