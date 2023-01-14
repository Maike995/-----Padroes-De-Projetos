public class Main {
    public static void main(String[] args) {
        Programa n1 = new Programa();
        Programa n2 = new Programa();
        Programa n3 = new Programa();

        n1.operacao();
        n2.operacao();
        n3.operacao();

        System.out.println(Log.getLog());
    }
}