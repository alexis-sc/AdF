
public class triangulo extends Figuras {
	public double C_valor;
	private double base;
	private double altura;
	
	public triangulo(double a, double p, double c_v, double b, double h ) {
		super(a, p);
		C_valor = c_v;
		this.base = b;
		this.altura = a;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double b) {
		this.base = b;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double h) {
		this.altura = h;
	}
	
	public void Datos() {
		System.out.println("Triangulo\nArea"+getArea()+"\nPerimetro: "+getPerimetro());
	}

	

	public void calcularArea(){
	    setArea (base*altura/2);
		}
	public void calcularPerimetro(){
	    setPerimetro(altura*3);
		}
		
	
}
