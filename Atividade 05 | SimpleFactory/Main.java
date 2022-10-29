
public class Main {

	public static void main(String[] args) {
    System.out.println();

    DBFactory test01 = new OracleDBFactory();
		DB banco01 = test01.getDatabase();
		banco01.query("Michael");
    banco01.update("Jean");
		System.out.println();
    
    DBFactory test02 = new PostgresDBFactory();
		DB banco02 = test02.getDatabase();
		banco02.query("Ricardo");
    banco02.update("Wily");
		System.out.println();
	}
}
