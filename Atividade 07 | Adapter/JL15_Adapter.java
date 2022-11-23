public class JL15_Adapter extends JL15_image implements ImagemTarget  {

  @Override
  public void carregarImagem(String nomeDoArquivo) {
    JL15_SelecionaImagem(nomeDoArquivo);

  }

  @Override
  public void desenharImagem(int posX, int posY, int largura, int altura, int width, int height) {
    JL15_ExibirImagem(posX, posY, largura, altura, width, height);
  
  }
}