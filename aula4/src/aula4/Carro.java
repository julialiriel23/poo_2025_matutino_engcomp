package aula4;

public class Carro extends Automovel {
	public boolean temArcondicionado;
	public void ligar() {
		super.ligar();
		System.out.println("Carro ligado!");
	}
}
