package familia28;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{
		float a,b,c,d,e,f,x,y;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("\nEntre com o A : ");
		a= leia.nextFloat();
		System.out.println("\nEntre com o B : ");
		b= leia.nextFloat();
		System.out.println("\nEntre com o C : ");
		c= leia.nextFloat();
		System.out.println("\nEntre com o D : ");
		d= leia.nextFloat();
		System.out.println("\nEntre com o E : ");
		e= leia.nextFloat();
		System.out.println("\nEntre com o F : ");
		f= leia.nextFloat();
	
	x = (c*e - b*f) / (a*e - b*d);
		
	y =	(a*f - c*d) / (a*e - b*d);
	
	System.out.println ("\nValor de x : "+x);
	
		
	}

}
