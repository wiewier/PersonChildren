package pl.mwo.parent_children.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Configuration {
    private static Configuration instance;

    private Connection dbConnection;

    private Configuration() {
        // It shouldn't be needed
        try {
            Class.forName("org.h2.Driver"); // rejestrowanie bloku statycznego z klasy Driver. program przy ladowania klasy, wykonuje statyczne bloki kodu. w tym przypadku uzywa tylko metody load(), dzieki ktoremu uczy sie jak rejestorwanc sie do BD.
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            dbConnection = DriverManager.getConnection(
                    "jdbc:h2:mem:parents-and-children");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Configuration getInstance() {
        if (null == instance) {
            instance = new Configuration();
        }

        return instance;
    }

    public Connection getDbConnection() {
        return dbConnection;
    }

    public static void main(String[] args) {

        Connection connection = Configuration.getInstance().getDbConnection();
        System.out.println(connection);
    }
}
