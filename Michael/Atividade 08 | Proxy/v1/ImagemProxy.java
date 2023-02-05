public class ImagemProxy implements Gerador{

  private Imagem image;

  public ImagemProxy(Imagem image){
	   this.image = image;
  }

  @Override
  public void desenhar(){
      System.out.println("Proxy preparando pra desenhar");
      image.desenhar();
  }

  @Override
  public void limpar(){
	   System.out.println("Proxy preparando para limpar");
	   image.limpar();
  }

  @Override
  public void pintar(){
	   System.out.println("Proxy preparando para pintar");
	   image.pintar();
  }

  @Override
  public void publicar(){
	   System.out.println("Proxy preparando para publicar");
	   image.publicar();
  }
  
}