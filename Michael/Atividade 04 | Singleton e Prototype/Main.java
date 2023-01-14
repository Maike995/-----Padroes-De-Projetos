class Main {
  public static void main(String[] args) {
    System.out.println("");


    
    App Test = App.getInstance() ;
		App TestApp01 =  Test.clonar();
    TestApp01.setCriador("Michael");
		TestApp01.setJdkUtilizado("Flutter");
		TestApp01.imprimir();
    App TestApp02 =  Test.clonar();
    TestApp02.setCriador("Ricardo");
    TestApp02.setJdkUtilizado("React Native");
		TestApp02.imprimir();

  }
}