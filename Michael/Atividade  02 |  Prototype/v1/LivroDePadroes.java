public class LivroDePadroes extends LivrosPrototype{

public LivroDePadroes(){
  
}
protected LivroDePadroes(LivroDePadroes novo){
  
  this.titulo="Design Patterns";
  this.nomeDoAutor="Eduardo Guerra";
  this.dedicatoria=novo.getDedicatoria();
    
}


public void imprimir() {
		
		System.out.println("O livro " + this.titulo + " do autor " + this.nomeDoAutor + " Dedicado a "+ getDedicatoria());
	
	}

  
	@Override
	public LivroDePadroes clonar() {
    
		return new LivroDePadroes (this);
	}
  
  
}