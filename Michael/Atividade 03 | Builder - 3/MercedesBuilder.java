

public class MercedesBuilder extends CarroBuilder {

	@Override
	public void buildPreco() {
		carro.preco = 9999.00;
	}

	@Override
	public void buildDscMotor() {
		carro.dscMotor = "2.5 Flex";
	}

	@Override
	public void buildAnoDeFabricacao() {
		carro.anoDeFabricacao = 2020;
	}

	@Override
	public void buildModelo() {
		carro.modelo = "Uno";
	}

	@Override
	public void buildMontadora() {
		carro.montadora = "Benz";
	}

  @Override
  public void buildOpcional() {
		carro.opcional = "Ultra Rebaixado";
	}

}
