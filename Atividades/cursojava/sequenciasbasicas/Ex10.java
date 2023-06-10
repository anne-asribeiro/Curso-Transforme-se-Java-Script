package cursojava.sequenciasbasicas;

import javax.swing.JOptionPane;

public class Ex10 {
    public static void main(String[] args) {
		double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura da parede:"));
		JOptionPane.showMessageDialog(null,"A Largura informada foi: " + largura);

		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da parede:"));
		JOptionPane.showMessageDialog(null,"A Altura informada foi: " + altura);
      
		double areaParede = largura * altura;

       double qtdTinta = areaParede / 2;

       JOptionPane.showMessageDialog(null,"A quantidade de litros de tinta necessária para pintar uma parede de " + areaParede + " metros quadrados é:" + qtdTinta);
        
        
	}
}