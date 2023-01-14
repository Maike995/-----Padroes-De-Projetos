
public class App extends AppPrototype{

  private App(){
    
  }
  private App(App novo){
   
  this.anoDeEstreia = 2022;
  this.versaoAtual="Windows 10";
  this.criador = getCriador();
  this.jdkUtilizado = getJdkUtilizado();
   
  }

public void imprimir() {
		
		System.out.println("O App de " + getCriador() + " fabricado em "
                       + this.anoDeEstreia+" feito inteiramente no "
                       + getJdkUtilizado() + " funcionando na versão do " 
                       + this.versaoAtual );
	
	}

	@Override
	public App clonar() {
    
		return new App (this);
	}
  

private static App uniqueInstance;

	public static synchronized App getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new App();

		return uniqueInstance;
	}

}