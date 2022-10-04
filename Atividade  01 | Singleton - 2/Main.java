class Main {
  public static void main(String[] args) {
    System.out.println("");

	    
    Conta contaCorrente = new Conta("Conta Corrente");
    Conta contaSalario = new Conta("Conta Salario");
    
     
  contaCorrente.depositar(300);
  contaSalario.sacar(100);
  contaCorrente.sacar(900);
  contaSalario.depositar(1200);
    
    
    System.out.println();
    System.out.println("A conta Corrente possui: "+contaCorrente.getSaldo());
    System.out.println("A conta Salario possui: "+contaSalario.getSaldo());

System.out.println();

    System.out.println(Log.getLog());
	}
}


    