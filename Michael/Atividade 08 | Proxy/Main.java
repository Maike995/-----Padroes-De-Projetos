
public class Main{
  
	public static void main(String[] args) {

    Gerador imagem = new ImagemProxy(new Imagem());

    imagem.desenhar();
    imagem.limpar();
    imagem.pintar();
    imagem.publicar();

  }

}
