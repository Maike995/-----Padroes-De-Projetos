
public class Main {

	public static void main(String[] args) {
System.out.println();

		ServicesAbstractFactory fabrica = new EJBAbstractFactory();
		 UserService pessoa = fabrica.criarUsuario();
		 CarService carro = fabrica.criarCarro();
		 pessoa.save("Michael");
     pessoa.delete(4);
     carro.save("Ricardo");
     carro.update("Siena");

    
		 fabrica = new RestAbstractFactory();
		 pessoa = fabrica.criarUsuario();
		 carro = fabrica.criarCarro();
		 pessoa.save("Michael");
     pessoa.delete(4);
     carro.save("Ricardo");
     carro.update("Siena");




    
	}
}
