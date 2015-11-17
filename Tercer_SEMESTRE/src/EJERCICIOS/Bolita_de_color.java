package EJERCICIOS;
import java.util.Scanner;
public class Bolita_de_color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner (System.in);
		int x,impt,opc = 0,op2 = 0,op1;
		double descuent,tot;
		do
		{
			x=1;
	while (x<=1){
		System.out.println(" **-- INGRESE POR FAVOR EL IMPORTE --** : ");
		impt=sc.nextInt();
		System.out.println(" **-- CUAL ES EL COLOR DE LA BOLITA?**-- \n1.ROJA\n2.AMARILLA\n3.BLANCA");
		op1=sc.nextInt();
		
		switch(op1){
		case 1:
			descuent=impt*0.4;
			tot=impt-descuent;
			System.out.println(" --** SU  TOTAL DE DESCUENTO DE SU COMPRA A PAGAR ES:$"+tot);
			break;
		case 2:
			descuent=impt*0.25;
			tot=impt-descuent;
			System.out.println(" --** SU  TOTAL DE DESCUENTO DE SU COMPRA A PAGAR ES :$"+tot);
			break;
		case 3:
			descuent=impt;
			System.out.println(" **-- SU  TOTAL DE DESCUENTO DE SU COMPRA A PAGAR ES:$"+descuent);
			break;
		}
		x++;
	}
	System.out.println("=====================================");
	System.out.println(" **-- DESEA OTRO CALCULO\n1.SI\n2.NO");
	System.out.println("=====================================");
	op2=sc.nextInt();
		}
		while (op2==1);
		System.out.println(" -*- USUARIO USTED A DECIDIDO SALIR GRACIAS POR USAR NUESTRO SISTEMA *-* ");
	}

}
