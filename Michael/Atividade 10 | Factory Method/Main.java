class Main {
  public static void main(String[] args) {
    System.out.println();

    FactoryMarca factory = new FactoryMarca();
		
		factory.getCarro("Lagarto", "Civic");
    factory.getCarro("Lagarto", "Corolla");
    factory.getCarro("Lagarto", "Jetta");
    factory.getCarro("Lagarto", "Cruze");
    
    System.out.println();
    
    factory.getCarro("Estancia", "Cruze");
    factory.getCarro("Estancia", "Compass");
    factory.getCarro("Estancia", "Fluence");
    factory.getCarro("Estancia", "Civic");

    System.out.println();
    
    factory.getCarro("aracaju", "Cruze");
    

  }
}
