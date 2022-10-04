class Main {
  public static void main(String[] args) {
    System.out.println("");

    Livro livroPrototype = new Livro ();
		Livro livroDeRedes01 =  livroPrototype.clonar("RedesDeComputadores");
		livroDeRedes01.setDedicatoria("Michael");
		livroDeRedes01.imprimir();
    Livro livroDeRedes02 =  livroPrototype.clonar("RedesDeComputadores");
    livroDeRedes02.setDedicatoria("Ricardo");
		livroDeRedes02.imprimir();
		Livro LivroDePadroes01 = livroPrototype.clonar("PadrõesDeProjeto");
		LivroDePadroes01.setDedicatoria("Jean");
		LivroDePadroes01.imprimir();
    Livro LivroDePadroes02 =  livroPrototype.clonar("PadrõesDeProjeto");
    LivroDePadroes02.setDedicatoria("Wily");
		LivroDePadroes02.imprimir();
  }
}