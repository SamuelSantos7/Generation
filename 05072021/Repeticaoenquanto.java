package familia28;

import java.util.Scanner;

public class Repeticaoenquanto {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{
		float nota1,nota2,nota3,somamedia=0,media,mediageral;
		int x,cont=0;
		Scanner leia= new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota");
		nota1= leia.nextFloat();
		System.out.println("\nEntre com a segunda nota");
		nota2= leia.nextFloat();
		System.out.println("\nEntre com a terceira nota");
		nota3= leia.nextFloat();
		
		media = (nota1+nota2+nota3)/3;
		System.out.printf("\nMedia: %2.2f",media);
	
	
	while(media!=0) 
	{
			somamedia = somamedia + media;
			cont++;
			System.out.println("\nEntre com a primeira nota");
			nota1= leia.nextFloat();
			System.out.println("\nEntre com a segunda nota");
			nota2= leia.nextFloat();
			System.out.println("\nEntre com a terceira nota");
			nota3= leia.nextFloat();
			media = (nota1+nota2+nota3)/3;
			System.out.printf("\nMedia: %2.2f",media);	

	}
		mediageral= somamedia/cont;
		System.out.println("\nMédia geral: "+mediageral);
	
	}		
}

