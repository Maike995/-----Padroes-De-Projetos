class Main {
  public static void main(String[] args) {
    System.out.println("");

    LivroDeRedes livroPrototype01 = new LivroDeRedes ();
		LivroDeRedes livroDeRede01 =  livroPrototype01.clonar();
		livroDeRede01.setDedicatoria("Michael");
		livroDeRede01.imprimir();
    LivroDeRedes livroDeRede02 =  livroPrototype01.clonar();
    livroDeRede02.setDedicatoria("Ricardo");
		livroDeRede02.imprimir();

    LivroDePadroes livroPrototype02 = new LivroDePadroes ();
		LivroDePadroes LivroDePadroes01 =  livroPrototype02.clonar();
		LivroDePadroes01.setDedicatoria("Jean");
		LivroDePadroes01.imprimir();
    LivroDePadroes LivroDePadroes02 =  livroPrototype02.clonar();
    LivroDePadroes02.setDedicatoria("Wily");
		LivroDePadroes02.imprimir();
  }
}