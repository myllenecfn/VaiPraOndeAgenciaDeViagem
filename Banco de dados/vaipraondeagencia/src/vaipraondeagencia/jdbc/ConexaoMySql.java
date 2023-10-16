package vaipraondeagencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySql {
	public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/vaipraondeagencia";
        String username = "root";
        String password = "Axl@9934a";

        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
