public class RestAbstractFactory implements ServicesAbstractFactory{


public UserService criarUsuario() {
 return new UserRestApiService();
}

 public CarService criarCarro() {
return new CarRestApiService();
}




  
}