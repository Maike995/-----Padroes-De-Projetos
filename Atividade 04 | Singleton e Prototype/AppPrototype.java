public abstract class AppPrototype {

  int anoDeEstreia;
  String versaoAtual;
  String criador;
  String jdkUtilizado;

public int anoDeEstreia(){
  return anoDeEstreia;
}
public String getVersaoAtual(){
  return versaoAtual;
}
public String getCriador(){
  return criador;
}
public String getJdkUtilizado(){
  return jdkUtilizado;
}

public void setAnoDeEstreia(int anoDeEstreia){
  this.anoDeEstreia=anoDeEstreia;
}
public void setVersaoAtual(String versaoAtual){
  this.versaoAtual=versaoAtual;
}
public void setCriador(String criador){
  this.criador=criador;
}
public void setJdkUtilizado(String jdkUtilizado){
  this.jdkUtilizado=jdkUtilizado;
}

public abstract void imprimir();
	
public abstract AppPrototype clonar();

  
}