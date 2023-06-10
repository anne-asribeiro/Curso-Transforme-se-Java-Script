package cursojava.sequenciasbasicas;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double grade1 = sc.nextDouble();

        System.out.println("Digite a segunda nota:");
        double grade2 = sc.nextDouble();

        double media = (grade1 + grade2) / 2;

        System.out.println("A média do aluno é " + media + ".");
    }
}
