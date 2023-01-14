

public class Livro extends LivrosPrototype{

  public Livro(){
    
  }
  protected Livro(String livro){
    //Pode ser tb o numero do livro em vez de seu titulo
    if(livro.equalsIgnoreCase("RedesDeComputadores")){
  this.titulo="Redes De Computadores";
  this.nomeDoAutor="Tanenbaum";
  this.dedicatoria=getDedicatoria();
    }
    if(livro.equalsIgnoreCase("PadrõesDeProjeto")){
      this.titulo="Design Patterns";
  this.nomeDoAutor="Eduardo Guerra";
  this.dedicatoria=getDedicatoria();
    }
  }

public void imprimir() {
		
		System.out.println("O livro " + this.titulo + " do autor " + this.nomeDoAutor + " foi dedicado a "+ getDedicatoria());
	
	}

	@Override
	public Livro clonar(String livro) {
    
		return new Livro (livro);
	}
  
  
}