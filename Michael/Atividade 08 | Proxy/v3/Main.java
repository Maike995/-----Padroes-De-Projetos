
public class Main{
  
	public static void main(String[] args) {
    System.out.println();
    Gerador imagem = new ImagemProxy("A2");

    imagem.desenhar();
    imagem.limpar();
    imagem.pintar();
    imagem.publicar();

    System.out.println();
    imagem = new ImagemProxy("A6");

    imagem.desenhar();
    imagem.limpar();
    imagem.pintar();
    imagem.publicar();

  }

}
