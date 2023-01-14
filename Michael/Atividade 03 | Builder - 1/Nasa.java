

public class Nasa {
protected FogueteBuilder montadora;

public Nasa (FogueteBuilder montadora) {
this.montadora = montadora;
}

public void construirFoguete() {
	montadora.buildPreco();
	montadora.buildnumeroassentos();
	montadora.buildtipoMotor();
  montadora.buildquantDeMotores();
	montadora.buildModelo();
	montadora.buildMontadora();
	montadora.buildModelo();
}
public FogueteProduct getFug() {
	return montadora.getFug();
}


}