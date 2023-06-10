package cursojava.sequenciasbasicas;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número real: ");
        double num = input.nextDouble();
        double dobro = num * 2;
        double tercaParte = num / 3;
        System.out.printf("O dobro de %.2f é %.2f e a terça parte é %.2f.", num, dobro, tercaParte);
    }
}