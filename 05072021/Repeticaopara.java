package familia28;

import java.util.Scanner;

public class Repeticaopara {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{
		float valor,soma=0;
		int x;
		Scanner leia= new Scanner(System.in);
		for(x=1;x<=5;x++)
		
		{
			System.out.println("\nEntre com um valor");
			valor= leia.nextFloat();
			
			soma= soma+valor;
							
		}
		{
			System.out.println("\nSomátorio dos valores:"+soma);
		}
				
	}

}
