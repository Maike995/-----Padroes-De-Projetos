class Main {
  public static void main(String[] args) {
    System.out.println();

    FactoryMarca proxy = new ProxyFactory("Michael","1234");
		
		proxy.getCarro("Lagarto", "Civic");
    proxy.getCarro("Lagarto", "Corolla");
    proxy.getCarro("Lagarto", "Jetta");
    proxy.getCarro("Lagarto", "Cruze");
    
    System.out.println();
    
    FactoryMarca hacker = new ProxyFactory("hacker","1234");
    
    hacker.getCarro("Lagarto", "Civic");
    hacker.getCarro("Lagarto", "Corolla");
    hacker.getCarro("Lagarto", "Jetta");
    hacker.getCarro("Lagarto", "Cruze");
  }
}
