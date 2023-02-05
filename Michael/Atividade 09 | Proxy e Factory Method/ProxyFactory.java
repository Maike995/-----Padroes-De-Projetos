public class ProxyFactory extends FactoryMarca{

  protected String usuario, senha;

  public ProxyFactory(String usuario, String senha) {
      this.usuario = usuario;
      this.senha = senha;
  }

  private boolean acesso() {
      return usuario == "Michael" && senha == "1234";
  }

  @Override
  public Marca getCarro(String cidade, String nome){
    
    if(acesso() == true){
        return super.getCarro(cidade,nome);
    }else{
        return null;
    }
    
  }

}