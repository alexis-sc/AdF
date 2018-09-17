import java.util.Scanner;
public class Persona {
String tel;
String nombre,a_p,a_m,direccion;
public static void main(String[] args) {

	Persona p1=new Persona();
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Dame tu numero");
	p1.tel=scan.nextLine();
	System.out.println("Dame tu nombre");
	p1.nombre=scan.nextLine();
	System.out.println("Dame tu apellido paterno");
	p1.a_p=scan.nextLine();
	System.out.println("Dame tu apellido matero");
	p1.a_m=scan.nextLine();
	System.out.println("Dame tu direccion");
	p1.direccion=scan.nextLine();
	
	
	System.out.println("Tu informacion es:");
	System.out.println(p1.tel+" "+p1.nombre+" "+p1.a_p+" "+p1.a_m+" "+p1.direccion);

}

}
