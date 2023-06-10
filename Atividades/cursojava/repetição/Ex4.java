package cursojava.repetição;

import javax.swing.JOptionPane;

public class Ex4 {

    public static void main(String[] args) {

        try {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes deseja repetir seu nome ?"));

            String nome = JOptionPane.showInputDialog("Digite seu nome:");

            for (int i = 0; i < num; i++) {
                System.out.println("Nome: " + nome);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Você digitou um valor invalido. Digite numeros por favor");
        }

    }
}