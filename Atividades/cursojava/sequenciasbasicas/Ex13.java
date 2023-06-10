package cursojava.sequenciasbasicas;

    import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário do funcionário: ");
        double salario = sc.nextDouble();
        double novoSalario = salario * 1.15;
        System.out.printf("O novo salário do funcionário é R$ %.2f.", novoSalario);
    }
}

