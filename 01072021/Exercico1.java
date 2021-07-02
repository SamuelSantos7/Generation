package familia28;

import java.util.Scanner;

public class Exercico1 {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{int idade = 0, dias = 0, meses= 0, idadedias, mesesdias, res;
	Scanner leia = new Scanner (System.in);
	System.out.println("\nQuantos anos voce tem : ");
	idade= (int) leia.nextFloat();
	System.out.println("\nQuantos meses voce tem: ");
	meses = (int) leia.nextFloat();
	System.out.println("\nQuantos dias voce tem : ");
	dias = (int) leia.nextFloat();
	

	idadedias = idade*365;
	mesesdias = meses*30;
	dias = dias;
	
	res = idadedias + mesesdias + dias;
	System.out.println("Voce possui no total "+ res );
			
	}
	

}
