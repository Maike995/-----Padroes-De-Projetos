public abstract class LivrosPrototype {

  String titulo;
  String nomeDoAutor;
  String dedicatoria;


public String getTitulo(){
  return titulo;
}
public String getNomeDoAutor(){
  return nomeDoAutor;
}
public String getDedicatoria(){
  return dedicatoria;
}

public void setTitulo(String titulo){
  this.titulo=titulo;
}
public void setNomeDoAutor(String nomeDoAutor){
  this.nomeDoAutor=nomeDoAutor;
}
public void setDedicatoria(String dedicatoria){
  this.dedicatoria=dedicatoria;
}

public abstract void imprimir();
	
public abstract LivrosPrototype clonar(String livro);

  
}