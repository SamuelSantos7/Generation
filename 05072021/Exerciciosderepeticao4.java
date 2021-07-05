package familia28;

import java.util.Scanner;

public class Exerciciosderepeticao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade, identgenero, fatorpsico, x=1;
		int contpc=0, contmn=0, contha=0, contoc=0, contpn40=0, contpc18=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(x<=5)
		{
			System.out.println("\nEntre com a sua idade");
			idade= leia.nextInt();
			System.out.println("\nEntre com a sua identidade de genero --1 feminino, -2masculino, 3- Outros");
			identgenero= leia.nextInt();
			System.out.println("\nEntre com seu fator psicologico -- 1 Calma, 2- nervosa, 3- agressiva ");
			fatorpsico= leia.nextInt();
			
			if(fatorpsico==1) {
				contpc++;
					}
			if(identgenero==1 && fatorpsico==2)	{
				contmn++;
			}
			if(identgenero==2 && fatorpsico==3) {
				contha++;
			}
			if(identgenero==3 && fatorpsico==1) {
				contoc++;
					}
			if(fatorpsico==2 && idade>48) {
				contpn40++;
			}
			if(fatorpsico==2 && idade<18) {
				contpc18++;
			}
			x++;
		}
		System.out.println("\nPessoas calmas :"+contpc);
		System.out.println("\nMulheres nervosas :"+contmn);
		System.out.println("\nHomens agressivos :"+contha);
		System.out.println("\nOutros calmos :"+contoc);
		System.out.println("\nPessoas nervosas com mais de 40 anos :"+contpn40);
		System.out.println("\nPessoas calmas com menos de 18 anos :"+contpc18);
	}
	

}