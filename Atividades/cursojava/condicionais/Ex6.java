package cursojava.condicionais;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ano do seu nascimento: ");
        int anoNascimento = sc.nextInt();
        int idade = 2023 - anoNascimento;
        if (idade < 18) {
            System.out.println("Faltam " + (18 - idade) + " anos para o alistamento.");
        } else if (idade == 18) {
            System.out.println("Você deve se alistar este ano.");
        } else {
            System.out.println("Já se passaram " + (idade - 18) + " anos do alistamento.");
        }
    }
}