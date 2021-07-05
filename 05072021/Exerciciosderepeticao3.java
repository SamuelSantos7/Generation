package familia28;
/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
import java.util.Scanner;

public class Exerciciosderepeticao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0, idade, idadeG = 0, contidademaior = 0, contidademenor = 0;
		
		Scanner leia= new Scanner(System.in);
		System.out.println("\nDigite sua idade meu mano");
		idade= leia.nextInt();
		
		while(idade!= -99)
		{
			System.out.println("\nDigite sua idade minha flor");
			idade= leia.nextInt();
			
		
		if(idade <21) {
			contidademenor ++;
		}
		else if (idade >50)	{
			contidademaior ++;
				}
		else {
			idadeG++;
		}
		}System.out.println("\nTotal de pessoas com menos de 21 anos : " +contidademenor );
		System.out.println("\nTotal de pessoas com menos de 21 anos : " +contidademaior );
	}
	

}
