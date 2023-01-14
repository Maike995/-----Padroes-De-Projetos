class Main {
  public static void main(String[] args) {
    System.out.println();

    ImagemTarget imagem = new JL15_Adapter();
		imagem.carregarImagem("teste.png");
		imagem.desenharImagem(70, 70, 10, 10, 5, 5);

    imagem = new JL15_Adapter();
		imagem.carregarImagem("teste.png");
		imagem.desenharImagem(60, 60, 30, 30, 500, 500);




    
  }
}