public class Main {
    public static void main(String[] args) {

        Conta c1 = new Conta();
        System.out.println("Meu saldo: " + c1.getSaldo());
        c1.setDeposito(25.00);
        System.out.println("Meu saldo: " + c1.getSaldo());
        System.out.println("Ouve um gasto.");
        c1.getSaque(10);
        System.out.println("Meu saldo: " + c1.getSaldo());
        System.out.println("\n");

        Conta c2 = new Conta();
        System.out.println("Meu saldo: " + c2.getSaldo());
        c2.setDeposito(50);
        System.out.println("Meu saldo: " + c2.getSaldo());
        System.out.println("Ouve um gasto.");
        c2.getSaque(25);
        System.out.println("Meu saldo: " + c2.getSaldo());

        System.out.println("\n\n");

        System.out.println(c2.getLogConta());


    }
}