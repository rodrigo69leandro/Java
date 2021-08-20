import java.util.Scanner;

/*
Faça um algoritmo que receba um número positivo e maior que zero, calcule e 
mostre seu valor ao quadrado.
*/



public class Exercicio2 {
	
	public static void main(String[] args) {
		
		int numero;
		int resultado;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		numero = input.nextInt();
		
		if(numero > 0 ) {
			
			resultado = (int) Math.pow(numero , 2);
			
			System.out.println("O número " + numero + " ao quadrado é " + resultado);
			
		}
		
		
	}

}
