package cursojava.repetição;

import javax.swing.JOptionPane;

public class Ex7 {

    public static void main(String[] args) {

        int somaIdades = 0;
        double media = 0.0;
        for (int i = 0; i < 20; i++) {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
            somaIdades += idade;
        }
        media = somaIdades / 20;
        System.out.println("Média de idades: " + media);
        System.out.println("Média de idades: " + (somaIdades / 20));

    }
}