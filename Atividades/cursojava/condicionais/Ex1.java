package cursojava.condicionais;

import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) {
        double velocidadeVeículo = Double.parseDouble(JOptionPane.showInputDialog("Informe a velocidade do veículo"));

        if (velocidadeVeículo > 80)
            ;
        {
            JOptionPane.showInputDialog("Você foi multado.");
            double valorMulta = 0.0;
            double velocidadeExcessiva = velocidadeVeículo - 80;
            valorMulta = velocidadeExcessiva * 5;
            JOptionPane.showInputDialog("Você ultrapassou a velocidade permitida em: " + velocidadeExcessiva + " km/h");

        }
    }

}