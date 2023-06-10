package cursojava.sequenciasbasicas;

import java.util.Scanner;


public class Ex8 {
    
public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Digite uma distância em metros: ");
	 double metros = input.nextDouble();
	 double km = metros / 1000;
     double hm = metros * 100;
     double dam = metros * 1000;
    System.out.printf("%.2f metros equivalem a %.2f quilometros, %.2f hectometros e %.2f decametros.", metros, km , hm , dam);
		    }
        }