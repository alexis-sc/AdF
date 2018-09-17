public class Main {

	public static void main(String[] args) {
		fecha f = new fecha();
		f.setDia(2);
		f.setMes("Junio");
		f.setAño(2018);
        System.out.println("Fecha: "+f.getDia()+"/"+f.getMes()+"/"+f.getAño());
    
	}
}
