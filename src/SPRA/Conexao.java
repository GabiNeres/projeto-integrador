package SPRA;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection getConnection() {
        Connection conexao = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetointegrador", "root", "12345");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conexao;
    }

}
