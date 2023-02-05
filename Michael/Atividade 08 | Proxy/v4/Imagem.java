public class Imagem implements Gerador{

/*
Classe Imagem tem a função de implementar os metodos da interface gerador mas diferente do ImagemProxy ela permite que vc crie imagens em qualquer tipo de folha 

*/
  
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