package Mayorde3;
import java.util.Scanner;


public class CalcEdad {

	public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
		int a = 0, aa, d, da, dm, m = 0,ma,mn;
		String mes = null;
                double an,dn;
                dm = 0;
                d =0;
		an = 1970;
		mn = 1;
		dn = 1;
		aa = 2013;
		ma = 3;
		da = 12;
		System.out.println("Fecha actual (dia, mes y año)");
		da = leer.nextInt();
		ma = leer.nextInt();
		aa = leer.nextInt();
		if (an<1970 && an>2010) {
			System.out.println("Has introducido un año invalido");
		}
		System.out.println("Introduce año nacimiento");
		an = leer.nextInt();
		if (mn<1 && mn>12) {
			System.out.println("Has introducido un mes invalido");
		}
		System.out.println("Introduce mes de naciemiento");
		mn = leer.nextInt();
		switch (mn) {
		case 1:
			mes = "Enero";
			dm = 31;
			break;
		case 2:
			mes = "Febrero";
			dm = 28;
			break;
		case 3:
			mes = "Marzo";
			dm = 31;
			break;
		case 4:
			mes = "Abril";
			dm = 30;
			break;
		case 5:
			mes = "Mayo";
			dm = 31;
			break;
		case 6:
			mes = "Junio";
			dm = 30;
			break;
		case 7:
			mes = "Julio";
			dm = 31;
			break;
		case 8:
			mes = "Agosto";
			dm = 31;
			break;
		case 9:
			mes = "Septiembre";
			dm = 30;
			break;
		case 10:
			mes = "Octubre";
			dm = 31;
			break;
		case 11:
			mes = "Noviembre";
			dm = 30;
			break;
		case 12:
			mes = "Diciembre";
			dm = 31;
			break;
		}
		if ((dn>dm)&&(dn<1)) {
			System.out.println("Has introducido un dia invalido");
		}
		System.out.println("Introduce el dia de tu nacimiento");
		dn = leer.nextInt();
		if ((ma)==(mn)) {
			if ((da)==(dn)) {
				a = (int) (aa-an);
				m = 0;
				d = 0;
				System.out.println("Caso 1");
			}
			if ((da)>(dn)) {
				a = (int) (aa-an);
				m = 0;
				d = (int) (da-dn);
				System.out.println("Caso 2");
			}
			if ((da)<(dn)) {
				a = (int) (aa-an-1);
				m = 11;
                                d = (int) (da-dn);
				d = 30-d;
				System.out.println("Caso 3");
			}
		} else {
			if (da>dn) {
				if (da==dn) {
					a = (int) (aa-an);
					m = ma-mn;
					d = 0;
					System.out.println("Caso 4");
				}
				if (da>dn) {
					a = (int) (aa-an);
					m = ma-mn;
					d = (int) (da-dn);
					System.out.println("Caso 5");
				}
				if (da<dn) {
					a = (int) (aa-an);
					m = ma-mn;
                                        d = (int) (da-dn);
					d = 30-d;
					System.out.println("Caso 6");
				}
			} else {
				if (da==dn) {
					a = (int) (aa-an-1);
					m = mn-ma;
					m = 12-m;
					d = 0;
					System.out.println("Caso 7");
				}
				if (da>dn) {
					a = (int) (aa-an-1);
					m = mn-ma;
					m = 12-m;
					d = (int) (da-dn);
					System.out.println("Caso 8");
				}
				if (da<dn) {
					a = (int) (aa-an-1);
					m = mn-ma+1;
					m = 12-m;
					d = (int) (da-dn);
					d = 30-d;
					System.out.println("Caso 9");
				}
			}
		}
		System.out.println("Naciste el: " +dn +" de " +mes +" de " +an);
		System.out.println("Tu edad es: " + a+" años " +m +" meses y " 
                        + d+" dias");
	}


}

