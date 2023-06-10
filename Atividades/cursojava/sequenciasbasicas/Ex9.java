package cursojava.sequenciasbasicas;

import java.util.Scanner;

public class Ex9 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma quantia em Reais (em R$): ");
        double reais = input.nextDouble();
        double cotacaoDolar = 3.45;
        double dolares = reais / cotacaoDolar;
        System.out.printf("Você pode comprar US$%.2f.", reais, dolares);
    }
}