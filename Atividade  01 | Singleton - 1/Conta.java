import java.util.*;

public class Conta {
    private Log logConta;

    //variáveis
    private static int idConta;
    private String tipoDeConta;
    private int numConta;
    private double saldo;
    private double saque;

    public Conta(){
        idConta++;
        numConta = idConta;
        logConta = Log.getInstance("ID_Conta: "+numConta+" - Nova conta ciada com sucesso!");
    }
    //métodos
    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta() {
        int num = -1;
        Scanner input = new Scanner(System.in);
        while(num<1 || num >2){
            num = input.nextInt();
            System.out.println("Qual o tipo da conta?");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");
        }
        if(num == 1){
            this.tipoDeConta = "1- Conta Corrente";
        }else{
            this.tipoDeConta = "2- Conta Poupança";
        }
        logConta = Log.getInstance("ID_Conta: "+numConta+" - Tipo de conta definida: "+tipoDeConta);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setDeposito(double deposito) {
        if (deposito >= 0) {
            this.saldo += deposito;
            logConta = Log.getInstance("ID_Conta: "+numConta+" - Depósito de R$ "+deposito+" efetuado.");
        } else {
            System.out.println("Valor de depósito inválido.");
            logConta = Log.getInstance("ID_Conta: "+numConta+" - Depósito inválido.");

        }

    }

    public void getSaque(double valor) {
        if (valor >= 0 && valor <= saldo) {
            saldo -= valor;
            logConta = Log.getInstance("ID_Conta: "+numConta+" - Saque de R$ "+valor+" efetuado.");
        } else {
            System.out.println("Saque inválido.");
            logConta = Log.getInstance("ID_Conta: "+numConta+" - Saque inválido.");
        }
    }

    public String getLogConta(){
        return logConta.getLog();
    }

}