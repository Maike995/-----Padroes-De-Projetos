public class Log {
    private static Log log;
    private String msg = "";

    private Log() {

    }

    public synchronized static Log getInstance(String str) {
        if (log == null) {
            log = new Log();
            log.setLog(str);
        } else {
            log.setLog(str);
        }

        return log;
    }

    public void setLog(String string) {
        msg = msg + string + "\n";
    }

    public String getLog() {
        return msg;
    }
}