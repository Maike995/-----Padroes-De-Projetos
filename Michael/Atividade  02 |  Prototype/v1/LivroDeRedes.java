

public class LivroDeRedes extends LivrosPrototype{

  public LivroDeRedes(){
    
  }
  protected LivroDeRedes(LivroDeRedes novo){
    
  this.titulo="Redes De Computadores";
  this.nomeDoAutor="Tanenbaum";
  this.dedicatoria=novo.getDedicatoria();
    
  }

public void imprimir() {
		
		System.out.println("O livro " + this.titulo + " do autor " + this.nomeDoAutor + " Dedicado a "+ getDedicatoria());
	
	}

	@Override
	public LivroDeRedes clonar() {
    
		return new LivroDeRedes (this);
	}
  
  
}