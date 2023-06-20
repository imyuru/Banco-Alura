package entidad;

public class CrearCuenta {

	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(0,0);
		primeraCuenta.setSaldo(400);
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta=new Cuenta(0,0);
		segundaCuenta.setSaldo(200);;
		System.out.println(segundaCuenta.getSaldo());

	}

}
