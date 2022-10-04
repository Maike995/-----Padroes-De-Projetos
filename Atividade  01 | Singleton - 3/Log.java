public class Log {
    private static Log log;
    private String historico = "";
    private Log(String str) {}

    public synchronized static Log getInstance(String str) {
        if (log == null) {
            log = new Log(str);
        }

        log.setLog(str);
        return log;
    }

    public void excluirLog(){
        log = null;
    }

    private void setLog(String str){
        historico+= str+"\n";
    }
    public static String getLog(){
        if(log != null) {
            return log.historico;
        }else{
            return "Log inexistente.";
        }
    }

}