package familia28;

import java.util.Scanner;

public class Laçosdedecisao2 {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{
		int a,b,c,crescente;
		
		
		Scanner leia= new Scanner(System.in);
		System.out.println("\nDigete o primeiro numero");
		a= leia.nextInt();
		System.out.println("\nDigete o segundo numero");
		b= leia.nextInt();
		System.out.println("\nDigete o terceiro numero");
		c= leia.nextInt();
		
		if(a>b && a>c && b>c)
		{
		    System.out.println("\nOrdem crescente :" c+b+a);
					
			
		}
		else if(b>a && b>c && c>a)
	
		{
			System.out.println("\nOrdem crescente :" a+c+b);
				
				
		}
		else
			
		{
			System.out.println("\nOrdem crescente :" b+a=c);
					
		}
	}
	
	
	

}
