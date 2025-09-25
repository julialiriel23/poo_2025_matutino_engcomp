package aula4;

public class Principal {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.setMarca  ("Fiat");
		c1.setModelo ("Pulse");
		c1.setAno (2026);
	
		Carro c2 = new Carro();
		c2.setMarca ("VW");
		c2.setModelo ("Nivus");
		c2.setAno (2025);
		
		System.out.println(c1.getModelo());
		System.out.println(c2.getModelo());
		
	}
}
