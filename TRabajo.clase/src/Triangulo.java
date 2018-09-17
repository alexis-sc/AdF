
public class Triangulo {
int base,altura,area;

public static void main(String[] args) {
	Triangulo t1=new Triangulo();
	Triangulo t2=new Triangulo();
	//triangulo 1
	t1.base=10;
	t1.altura=8;
	t1.area=(t1.base * t1.altura)/2;
	System.out.println("El area 1 es de: " +t1.area);
	 //truangulo 2
	t2.base=15;
	t2.altura=20;
	t2.area=(t2.base * t2.altura)/2;
	System.out.println("El area 2 es de: " +t2.area);
	
}

}
