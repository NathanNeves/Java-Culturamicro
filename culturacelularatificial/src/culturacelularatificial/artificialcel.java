package culturacelularatificial;
import java.util.Scanner;
import java.lang.*;
import java.lang.Math;
public class artificialcel {

public static void main(String[] args)
{
System.out.println("Cultura artificial v 1.0");	
System.lineSeparator();
System.out.println("LEGENDA");
System.lineSeparator();
System.out.println("1-C�lculo do n�mero de bact�rias");
int menu = 0;
Scanner scan = new Scanner(System.in);
menu = scan.nextInt();

if(menu == 1)
{
double t;
double v;
double g;
double r;
double tt;
double rr;


System.out.println("Insira a dura��o da cultura: ");
t = scan.nextDouble();	
System.lineSeparator();
System.out.println("Insira o n�mero de microrganismos inicial:");
v = scan.nextDouble();
System.lineSeparator();
System.out.println("Insira o tempo de reprodu��o da bact�ria");
tt = scan.nextDouble();
System.lineSeparator();
r = t/tt;
rr = Math.pow(v, r);
System.out.println("O n�mero de microrganismos ap�s:" +t+"  Minutos �:" +rr);


}


}
}
