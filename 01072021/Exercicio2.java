package familia28;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{	
	int totaldias, anos, meses, dias;
	
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o total de dias vividos : ");
		
		totaldias= (int) leia.nextInt();
				anos= totaldias/365;
				meses= (int) (Math.pow(totaldias, 365) /30);
				dias= (int) (Math.pow(totaldias, 365)/ 30);
				
				System.out.println("\nEu vivi: "+anos+ " ano(s), " +meses+"mese(s)" + dias+ "dia(s)de vidas" );
				
		
	}

}
