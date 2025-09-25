package aula5;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		ArrayList<String> disciplinas = new ArrayList<String>();
		disciplinas.add("Cálculo II");
		disciplinas.add("Algebra Linear");
		disciplinas.add("Circuitos Elétricos");
		disciplinas.add("Calculo III");
		
		System.out.println(disciplinas);
		
		System.out.println(disciplinas.get(2));
		
		disciplinas.set(3, "Cálculo IV");
		System.out.println(disciplinas);
		
		
		for(int i = 0; i < disciplinas.size(); i++) {
			System.out.println(disciplinas.get(i));
			
		} 
		
		
	}
}
