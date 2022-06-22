package sara;

public class ClasePrincipal {
	public static void main(String[] args) {
		Coche coche_abuelo=new Coche();
		coche_abuelo.setMarca("Skoda");
		coche_abuelo.setModelo("R2");
		coche_abuelo.setPotencia(100);
		
		System.out.println("El coche es de un modelo: "+coche_abuelo.getModelo()+", la marca: "+coche_abuelo.getMarca()+" y la potencia: "+coche_abuelo.getPotencia());
	}
}
