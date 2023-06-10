package cursojava.repetição;

import javax.swing.JOptionPane;

public class Ex8 {

    public static void main(String[] args) {

        int somaQtPessoasMaioresDeIdade = 0;

        for (int i = 0; i < 4; i++) {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
            if (idade >= 18) {
                somaQtPessoasMaioresDeIdade++;
            }
        }
        System.out.println("Soma total de pessoas maiores de idade: " + somaQtPessoasMaioresDeIdade);
    }

}