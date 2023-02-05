public class Imagem implements Gerador{

  @Override
  public void desenhar(){
	   System.out.println("Imagem criada");
  }

  @Override
  public void limpar(){
	   System.out.println("Imagem limpa");
  }

  @Override
  public void pintar(){
	   System.out.println("Imagem pintada");
  }

  @Override
  public void publicar(){
	   System.out.println("Imagem publicada");
  }
  
}