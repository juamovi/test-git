package amigos;

import java.util.Scanner;

public class Amigos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, suma1, suma2; 
		
		System.out.println("Introduzca numero 1:");
		n1= sc.nextInt();
		System.out.println("Introduzca numero 2:");
		n2= sc.nextInt();		
		
		
		suma1 = sumaDivisor(n1);
		System.out.println("La suma de los divisores de  " + n1 + " es igual a " + suma1 );
		
		suma2 = sumaDivisor(n2);
		System.out.println("La suma de los divisores de  " + n2 + " es igual a " + suma2 );
		
		if((suma1 ==n2) && (suma2==n1)) {
			System.out.println("LOS NÚMEROS " + n1 + " y " + n2 + " SÍ QUE SON AMIGOS.");
		}
		sc.close();
	}
	
	
	public static int sumaDivisor(int numero) {
		
		int suma =0;
		
		for(int i=1;i<numero;i++) {
			
			if((numero%i)==0) {
				suma = suma + i;
				
			}
						
		}
		return suma;
		
	}

}
