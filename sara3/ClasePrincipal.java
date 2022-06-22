package sara3;

import java.util.Scanner;

public class ClasePrincipal {
	public static void main(String[] args) {
		//Coche(String marca, String modelo, int potencia)
		String marca=EntradaSalida.obtenerMarca();
		String modelo=EntradaSalida.obtenerModelo();
		int potencia=EntradaSalida.obtenerPotencia();
		Coche c=new Coche(modelo, modelo, potencia);
		System.out.println(c);
		
		
	}
	
	
}
