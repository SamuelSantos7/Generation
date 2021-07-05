package familia28;

import java.util.Scanner;

/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
public class Exerciciosderepeticao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0, media=0, multiplo=0, soma=0;
		
		
		Scanner leia = new Scanner(System.in);
	
		
		do {
			System.out.println("\nEntre com um numero");
			x= leia.nextInt();
			
			if(x%3==0) {
						soma=soma+x;
						multiplo++;
						
			}
		} while(x!=0);
			media=soma/multiplo;
			
			System.out.println("\nMedia dos multiplos de 3 : "+media);
		}
	}


