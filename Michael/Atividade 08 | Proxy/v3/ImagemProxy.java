public class ImagemProxy extends Imagem{

  public String folha;

  public ImagemProxy(String folha){
    this.folha = folha;
  }

  public boolean getFolha(){
    return folha == "A4" || folha == "A1" || folha ==  "A2";
  }
  
  @Override
  public void desenhar(){
    if(getFolha() == true){
      super.desenhar();
    }else{
      System.out.println("Folha inadequada para desenhar");
    }
  }

  @Override
  public void limpar(){
     if(getFolha() == true){
	     super.limpar();
     }else{
       System.out.println("Porfavor insira uma Folha");
     }
  }

  @Override
  public void pintar(){
    if(getFolha() == true){
	     super.pintar();
    }else{
       System.out.println("Porfavor insira uma Folha");
     }
  }

  @Override
  public void publicar(){
     if(getFolha() == true){
	     super.publicar();
     }else{
       System.out.println("Porfavor insira uma Folha");
     }
  }
  
}