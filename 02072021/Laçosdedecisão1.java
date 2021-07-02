package familia28;

import java.util.Scanner;

public class Laçosdedecisão1 {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{
		int a,b,c,maior;
			
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite um numero ");
		a= leia.nextInt();
		System.out.println("\nDigite um numero ");
		b= leia.nextInt();
		System.out.println("\nDigite um numero ");
		c= leia.nextInt();
		
	
		if(a>b && a>c)
	
		{
			System.out.println("\nSera "+a+" seu numero maior ");
		}
		
		else if (b>a && b>c)
		{
		
			System.out.println("\nSera "+b+" seu numero maior ");
			
					}
		else
		{
			System.out.println("\nSera "+c+" seu numero maior ");
		}
		
	}

}
