

public abstract class FogueteBuilder {
protected FogueteProduct foguete;
public FogueteBuilder() {
foguete = new FogueteProduct();
}
public abstract void buildPreco();
public abstract void buildtipoMotor();
public abstract void buildquantDeMotores();
public abstract void buildnumeroassentos();
public abstract void buildModelo();
public abstract void buildtanque();
public abstract void buildMontadora();
public FogueteProduct getFug() {
return foguete;
}
}