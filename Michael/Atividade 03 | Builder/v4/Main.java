

public class Main {

	public static void main(String[] args) {
		Nasa concessionaria = new Nasa(new fogueteModelo1());

		concessionaria.construirFoguete();
		FogueteProduct foguete = concessionaria.getFug();
		System.out.println("Foguete: " + foguete.modelo + "/" + foguete.montadora
		+ "\nQuantidade de Motores: " + foguete.quantDeMotores + "\nNumero de assentos: " + foguete.numeroassentos + "\nMotor: "
		+ foguete.tipoMotor + "\nValor: R$ " + foguete.preco);
		System.out.println();

		concessionaria = new Nasa (new fogueteModelo2());
		concessionaria.construirFoguete();
		foguete = concessionaria.getFug();
		System.out.println("Foguete: " + foguete.modelo + "/" + foguete.montadora
		+ "\nQuantidade de Motores: " + foguete.quantDeMotores + "\nNumero de assentos: " + foguete.numeroassentos + "\nMotor: "
		+ foguete.tipoMotor + "\nValor: R$ " + foguete.preco);

		}
	}
