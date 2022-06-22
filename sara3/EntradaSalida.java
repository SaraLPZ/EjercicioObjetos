package sara3;

import java.util.Scanner;

public class EntradaSalida {
	static String obtenerMarca() {
		String marca= "";
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca la marca");
		marca=sc.nextLine();
		return marca;
	}
	static String obtenerModelo() {
		String modelo= "";
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el modelo");
		modelo=sc.nextLine();
		return modelo;
	}
	static int obtenerPotencia() {
		int potencia= 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el peso");
		potencia=sc.nextInt();
		return potencia;
	}
}
