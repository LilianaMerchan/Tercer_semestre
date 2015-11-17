package EJERCICIOS;

import java.util.Scanner;

public class ESTUDIANTE_DE_50_ALUMNOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		int x,acum=0;
		double calif,porcent;
		
		System.out.println("=========================================");
		System.out.println(" ******* CALCULO DE ALUMNOS ******");
		System.out.println("=========================================");
		
		for (x=1;x<=50;x++){
			do{
				System.out.println(" *-* INGRESE CALIFICACION n°"+x+" POR FAVOR:");
				calif=sc.nextDouble();
				if (calif<1||calif>100){
					System.out.println(" *** ERROR EL RANGO DE CALIFICACIONES");
				}	
			}while (calif<1||calif>100);
				if (calif<70){
					acum=acum+1;
				}
			}
			porcent=acum*100/50;
			System.out.println(" *-* CANTIDAD DE REPROBADOS ES =  a  "  +acum+ " REPROBADOS");
			System.out.println(" *** EL PORCENTAJE DE REPROBADOS ES "    +porcent+ "%");
			
			System.out.println("============================================");
			System.out.println(" **** GRACIAS POR USAR NUESTRO SISTEMA **** ");
			System.out.println("============================================");
			
		}
	}
