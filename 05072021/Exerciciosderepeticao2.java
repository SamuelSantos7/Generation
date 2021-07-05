package familia28;
/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
import java.util.Scanner;

public class Exerciciosderepeticao2 {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{
		int x, par=0 , impar=0, num;
		Scanner leia= new Scanner(System.in);
		
		for(x=1;x<=10;x++) {
		System.out.println("\nEntre com os numeros ");
		num = leia.nextInt();
		if(num %2 ==0) {
		num= par++;}
		
		
		else{
		num=par++;}
		}
		
		System.out.println("\n"+par+ "Valores pares");
		
		System.out.println("\n"+impar+ "Valores impares");
		}
			
	
	}


