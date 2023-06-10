package cursojava.condicionais;

import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String[] args) {

        final int ANO_ATUAL = 2023;

        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe seu ano de nascimento"));

        int idade = ANO_ATUAL - anoNascimento;

        if (idade < 70 && idade >= 16) {
            JOptionPane.showInputDialog(("Você está apto a votar ."));
        } else
            JOptionPane.showInputDialog(("Você não está apto a votar ."));
    }
}