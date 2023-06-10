package cursojava.sequenciasbasicas;

import javax.swing.JOptionPane;

public class Ex3 {
    public static void main(String[] args) {
		double salario= Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salario?"));
		JOptionPane.showMessageDialog(null,"O salário informado foi: " + salario);
		
    }  
}