
public class principal {

	public static void main(String[] args) {
		
auto a1 = new auto();
	a1.avanzar();
	
	for(int i=1;i<21;i++) {
		System.out.println(+i+"El auto: "+a1.estado);
	}
   a1.derecha();
   System.out.println("El auto gira a la:"+a1.estado);
   
   a1.avanzar();
   for(int i=1;i<11;i++) {
		System.out.println(+i+"El auto: "+a1.estado);
	}
   a1.izquierda();
   System.out.println("El auto gira a la:"+a1.estado);
   
   a1.avanzar();
   for(int i=1;i<11;i++) {
		System.out.println(+i+"El auto: "+a1.estado);
	}
   a1.izquierda();
   System.out.println("El auto gira a la:"+a1.estado);
   
   a1.avanzar();
   for(int i=1;i<21;i++) {
		System.out.println(+i+"El auto: "+a1.estado);
	}
   a1.izquierda();
   System.out.println("El auto gira a la:"+a1.estado);
   a1.avanzar();
   for(int i=1;i<11;i++) {
		System.out.println(+i+"El auto: "+a1.estado);
	}
   a1.retroceder();            
   System.out.println("El auto:"+a1.estado);
   a1.avanzar();
   for(int i=1;i<11;i++) {
		System.out.println(+i+"El auto: "+a1.estado);
	}
   
 }	
}
