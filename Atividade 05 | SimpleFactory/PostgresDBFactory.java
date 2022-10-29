
public class PostgresDBFactory implements DBFactory {

  public DB getDatabase() {
		return new PostgresDB();
	}
}