import java.util.Calendar;
public class Programa {
    Log logProg;
    public Programa() {
    }

    public void operacao() {
        logProg = Log.getInstance(Calendar.getInstance().getTime() + ": Mensagem de log [...]. ");        try {
            Thread.sleep(2000);
            System.out.println("Operação concluída.");
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}