package cursojava.sequenciasbasicas;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        System.out.print("Digite um número inteiro: ");
		        int num = input.nextInt();
		        int antecessor = num - 1;
		        int sucessor = num + 1;
		        System.out.println("O antecessor é: " + antecessor  + " O Sucessor é: " + sucessor);
		    }
		}
