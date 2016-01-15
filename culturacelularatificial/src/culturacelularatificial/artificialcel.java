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
System.out.println("1-Cálculo do número de bactérias");
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


System.out.println("Insira a duração da cultura: ");
t = scan.nextDouble();	
System.lineSeparator();
System.out.println("Insira o número de microrganismos inicial:");
v = scan.nextDouble();
System.lineSeparator();
System.out.println("Insira o tempo de reprodução da bactéria");
tt = scan.nextDouble();
System.lineSeparator();
r = t/tt;
rr = Math.pow(v, r);
System.out.println("O número de microrganismos após:" +t+"  Minutos é:" +rr);


}


}
}
