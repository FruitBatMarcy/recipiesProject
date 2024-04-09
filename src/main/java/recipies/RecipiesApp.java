package recipies;

import recipies.dao.DbConnection;

public class RecipiesApp {

	public static void main(String[] args) {
		 DbConnection conn = new DbConnection();
		 conn.getConnection();
	}
}
