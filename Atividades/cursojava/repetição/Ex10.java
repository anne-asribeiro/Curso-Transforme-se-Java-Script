package cursojava.repetição;

import javax.swing.JOptionPane;

public class Ex10 {

    public static void main(String[] args) {

        String tabuada = "";
        int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));

        for (int i = 1; i <= 10; i++) {
            tabuada += num + " X " + i + "=" + (num * i) + "\n";
        }
        JOptionPane.showMessageDialog(null, tabuada);
    }
}