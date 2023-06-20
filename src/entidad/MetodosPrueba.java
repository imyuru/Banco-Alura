package entidad;

public class MetodosPrueba {

	public static void main(String[] args) {
		Cuenta cuentaDeGabriela = new Cuenta(0,0);
		cuentaDeGabriela.setSaldo(100);
		cuentaDeGabriela.deposita(50);
		System.out.println(cuentaDeGabriela.getSaldo());

		boolean consigioRetirar = cuentaDeGabriela.saca(20);
		System.out.println(cuentaDeGabriela.getSaldo());
		System.out.println(consigioRetirar);

		Cuenta cuentaDeJimena = new Cuenta(0,0);
		cuentaDeJimena.deposita(1000);

		boolean exitoTransferencia = cuentaDeJimena.transfiere(300, cuentaDeGabriela);
		if (exitoTransferencia) {
			System.out.println("transferencia exitosa");
		} else {
			System.out.println("falto dinero");
		}
	}

}
