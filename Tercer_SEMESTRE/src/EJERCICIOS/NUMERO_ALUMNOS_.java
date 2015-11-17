package EJERCICIOS;
import java.util.Scanner;
public class NUMERO_ALUMNOS_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float suma=0,promedio;
		Scanner leer=new Scanner(System.in); 
		for(int n=1;n<6;n++) { 
			System.out.println(" **--ALUMNOS**--"+n+" : ");
			suma+=leer.nextFloat();
		} promedio=suma/5; 
		
System.out.println(" *-* EL PROMEDIO DEL GRUPO ES *-* : "+promedio);

System.out.println("=====================================================");
System.out.println(" *-* GRACIAS POR USAR NUESTRO SISTEMA DE ALUMNOS *-* ");
System.out.println("=====================================================");
} 
}