

public class FactoryMarca{

  public Marca getCarro(String cidade, String nome){
    
    if(cidade.equalsIgnoreCase("Estancia")){
		    if (nome.equalsIgnoreCase("Cruze"))
			    return new Estancia(nome);
		    else if (nome.equalsIgnoreCase("Compass"))
			    return new Estancia(nome);
        else if (nome.equalsIgnoreCase("Fluence"))
		  	  return new Estancia(nome);
        else{
          System.out.println("Carro indisponivel para alocação na cidade de Estancia.");
          return null;
        }
    }
    else if(cidade.equalsIgnoreCase("Lagarto")){
        if (nome.equalsIgnoreCase("Civic"))
			    return new Lagarto(nome);
        else if (nome.equalsIgnoreCase("Corolla"))
			    return new Lagarto(nome);
        else if (nome.equalsIgnoreCase("Jetta"))
			    return new Lagarto(nome);
        else{
        System.out.println("Carro indisponivel para alocação na cidade de Lagarto.");
        return null;
        }
    }
    else{
        return new NovaCidade(nome);
    }
    
  }
}