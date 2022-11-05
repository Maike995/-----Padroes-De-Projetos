public class EJBAbstractFactory implements ServicesAbstractFactory{

public UserService criarUsuario() {
 return new UserEJBService();
}

 public CarService criarCarro() {
return new CarEJBService();
}



  
}