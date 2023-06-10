package cursojava.sequenciasbasicas;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print ("Digite o valor do produto:");
		double preco = input.nextDouble();
		double desconto = preco * 0.05;
        double promo = preco - desconto;
        System.out.println("O preço do produto com desconto é:" + promo);
      
        
	}
	
   
}