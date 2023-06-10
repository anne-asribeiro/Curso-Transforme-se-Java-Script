package cursojava.sequenciasbasicas;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Digite um número");
		 int valorA = scan.nextInt();
		 
		 System.out.println("Digite outro número");
		 int valorB = scan.nextInt();
		 	
		 System.out.println("Digite outro número");
		 int valorC = scan.nextInt();
		 
		 int delta = (valorB^2) - (4*valorA*valorC);
		 
		System.out.println("Delta é igual a "  + delta);
        
	
	}
}