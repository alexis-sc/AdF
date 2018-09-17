import java.util.Scanner;
public class principal {

	private static Scanner scan;

	public static void main(String[] args) {
	scan = new Scanner(System.in);
	double l=0,a=0,p=0;
	double r=0;
	double b=0;
	double h=0;
	int opc=1;
	double c_v=0;
			cuadrado obj1=new cuadrado(l,c_v,a,p);
			circulo obj2=new circulo(r,c_v,a,p);
			triangulo obj3=new triangulo(b,h,c_v,a,p);
			do {
				
			System.out.println("-----Menu-----");	
			System.out.println("Que area desea saber");
			System.out.println("1)Area del cuadrado");
			System.out.println("2)Area del circulo");
			System.out.println("3)Area de un triangulo");
			System.out.println("4) Salir");
			opc = scan.nextInt();
		
			
switch(opc){
	case 1:
		System.out.println();
			System.out.println("El area es : "+obj1.getArea());
			System.out.println("El perimetro es : "+obj1.getPerimetro());
			System.out.println("Quieres una cambiar el valor del area y perimetro 1(si) 2(no)");
				obj1.C_valor=scan.nextDouble();
if(obj1.C_valor<=1){
			System.out.println("Digita el lado");
			//Se coloca el vaor de la variable para que lo pueda leer el scanner 
	    obj1.setLado(scan.nextDouble());        
	    obj1.calcularArea();
        obj1.calcularPerimetro();
        obj1.Datos();  
}
		break;
		
	case 2:
		System.out.println();
		System.out.println("El area es : "+obj2.getArea());
		System.out.println("El perimetro es : "+obj2.getPerimetro());
		System.out.println("Quieres cambiar el valor del radio 1(si) 2(no)");
			  obj2.C_valor=scan.nextDouble();
if(obj2.C_valor<=1) {
		    System.out.println("Digita el radio");
		      
		    obj2.setRadio(scan.nextDouble());        
		    obj2.calcularArea();
	        obj2.calcularPerimetro();
	        obj2.Datos();  
	
		}

		break;
		
	case 3:
		System.out.println();
		System.out.println("El area es : "+obj3.getArea());
		System.out.println("El perimetro es : "+obj3.getPerimetro());
		System.out.println("Quieres cambiar el valor del area 1(si) 2(no)");
			  obj3.C_valor=scan.nextDouble();
	 if(obj3.C_valor<=1) {
			    System.out.println("Digita la base");
			    obj3.setBase(scan.nextDouble());
			    System.out.println("Digita la altura");
			    obj3.setAltura(scan.nextDouble());
			    obj3.calcularArea();
		        obj3.calcularPerimetro();
		        obj3.Datos();  			
			  }
	 
		break;
		
	case 4:
		System.out.println("salir");
		break;
		
		default:
			System.out.println("No existe esa opccion");
			break;
	    }
		}while(opc!=4);
	  }
	}

 