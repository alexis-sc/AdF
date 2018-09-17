
public class cuadrado extends Figuras{
private double lado;
public double C_valor;

public cuadrado(double l,double c_v, double a, double p) {
	super(a,p);		         								
	this.lado=l;
	this.C_valor=c_v;
}
//Se coloca el valor de la variable para 
//que se pueda escanear 
public void setLado(double l) {
	this.lado=l;
}

public double getLado() {
	return lado*lado;
  }

public void Datos() {
	System.out.println("Cuadrado\nLado"+getArea()
	+"\nPerimetro: "+getPerimetro());
}


public void calcularArea(){
    setArea(lado*lado);
	}
public void calcularPerimetro(){
    setPerimetro(4*lado);
	}

}