package cursojava.condicionais;

import javax.swing.JOptionPane;

public class Ex4 {
    public static void main(String[] args){

    int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
    
    if(num % 2 == 0) JOptionPane.showMessageDialog(null, "Numero par");
    else JOptionPane.showMessageDialog(null, "Numero impar");
    
}
}