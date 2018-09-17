
public class circulo extends Figuras {
	private double radio;
	public double C_valor;
	
	
	public circulo(double r,double c_v,double a, double p) {
		super(a,p);
		this.radio=r;
		this.C_valor=c_v;
	}
	
	public void setRadio(double r) {
		this.radio=r;
		
	}
	
	public double getRadio() {
		return (radio*radio)*3.1416; 
 }
	
	public void Datos() {
		System.out.println("Circulo\nArea"+getArea()+"\nPerimetro: "+getPerimetro());
	}

	

	public void calcularArea(){
	    setArea(radio*radio*3.1416);
		}
	public void calcularPerimetro(){
	    setPerimetro(2*3.1416*radio);
		}

}