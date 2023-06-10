package cursojava.condicionais;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float nota1 = scan.nextFloat();

        System.out.println("Digite a aaegunda nota: ");
        float nota2 = scan.nextFloat();

        float media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Nota maior que 7, você está aprovado.");
        } else
            System.out.println("Nota menor que 7, você está reprovado.");

        System.out.println("Média " + media);
    }

}