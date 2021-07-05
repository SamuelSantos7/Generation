package familia28;
/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
import java.util.Scanner;

//*5-	Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)\\*
public class Exerciciosderepeticao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, somanum=0;
		Scanner leia= new Scanner(System.in);
	
				
		do {
			System.out.println("\nDigite um numero");
			num = leia.nextInt();
			somanum= somanum+num;
					
		}
		while(num!=0);
		System.out.println("\nSoma dos numeros digitados anteriormente foi ... " +somanum);
	}	

}
