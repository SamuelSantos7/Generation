package familia28;

import java.util.Scanner;

public class Laçosdecisao3 {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{
		int idade;
		Scanner leia= new Scanner(System.in);
		System.out.println("\nEntre com a sua idade");
		idade = leia.nextInt();
		if(idade>=14 && idade<=14)
		{
			System.out.println("\nCategoria Infantil");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("\nCategoria Juvenil");
		}
		else if (idade>=18 && idade<=25)
		{
			System.out.println("\nCategoria Adulto");
		}
	
		else
		{
			System.out.println("\nNenhuma Categoria");
		}
	}

}
