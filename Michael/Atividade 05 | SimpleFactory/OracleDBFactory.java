
public class OracleDBFactory implements DBFactory {
  
  public DB getDatabase() {
		return new OracleDB();
	}
  
}