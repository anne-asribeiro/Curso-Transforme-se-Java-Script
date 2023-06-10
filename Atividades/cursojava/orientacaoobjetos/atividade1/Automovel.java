package cursojava.orientacaoobjetos.atividade1;

public class Automovel {
   
    
	String modelo;
	String fabricante;
	String cor;
	
	int qtPortas;
	int pontenciaCavalos;
	double velocidadeMaxima;
	int qtMarchas;
	boolean temArCondicionado;
	boolean estaLigado = false;

	public void ligar(boolean estaLigado) {
		if (estaLigado == false) {
			this.estaLigado = true;
			
		}
		
		
	}
	public void desligar(boolean estaLigado) {
		if (estaLigado) {
			this.estaLigado = false;
		}	
	}
	
}