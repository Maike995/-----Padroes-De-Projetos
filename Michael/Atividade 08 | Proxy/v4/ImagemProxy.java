public class ImagemProxy implements Gerador{

/*
Clasee ImagemProxy tem a função de implementar os metodos da interface gerador e nesses metodos ele so permitir que imagens so possam ser criadas em folhas A4,A1 e A2 depois que a folha correta é inserida ele chama o metodo da classe Imagem para realizar a ação
*/

  
  public Imagem image;
  public String folha;

  public ImagemProxy(String folha){
    if(image == null){
      image = new Imagem();
    }
    this.folha = folha;
  }

  public boolean getFolha(){
    return folha == "A4" || folha == "A1" || folha ==  "A2";
  }
  
  @Override
  public void desenhar(){
    if(getFolha() == true){
      image.desenhar();
    }else{
      System.out.println("Folha inadequada para desenhar");
    }
  }

  @Override
  public void limpar(){
     if(getFolha() == true){
	     image.limpar();
     }
  }

  @Override
  public void pintar(){
    if(getFolha() == true){
	     image.pintar();
    }
  }

  @Override
  public void publicar(){
     if(getFolha() == true){
	     image.publicar();
     }
  }
  
}