public class ImagemProxy extends Imagem{

  @Override
  public void desenhar(){
      System.out.println("Proxy preparando pra desenhar");
      super.desenhar();
  }

  @Override
  public void limpar(){
	   System.out.println("Proxy preparando para limpar");
	   super.limpar();
  }

  @Override
  public void pintar(){
	   System.out.println("Proxy preparando para pintar");
	   super.pintar();
  }

  @Override
  public void publicar(){
	   System.out.println("Proxy preparando para publicar");
	   super.publicar();
  }
  
}