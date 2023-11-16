package com.devcolibri.database;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import javax.xml.transform.Result;
import java.sql.*;

public class Main {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "0635133204Zx_";
    private static final String URL = "jdbc:mysql://localhost:3306/TEST 1";

    public static void main(String[] args) {

        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); Statement statement = connection.createStatement()) {

//   0
                                                        // Используем для проверки подключения к серверу
                                            //               System.out.println(connection.isClosed());

//   1
            //  execute()  ->  универсальная команда
            //  Используется для вставки полей в таблицу
//                        statement.execute("INSERT INTO User1 (Email,Name) VALUES ('ADIKS901','DIMA');");

//   2
            // executeUpdate() -> Выполняются запросы -> INSERT, UPDATE, DELETE.
            // Получать данные этим запросом нельзя
//                       int res =  statement.executeUpdate("UPDATE User1 SET Email='DIMON_@gmai.com', Age ='1000', Name = 'PAKIMON' WHERE id=1;");

//  3 ?      executeQuery() ->  Этим методом можно осуществлять только "SELECTED" (ИЗБРАННЫЙ)
//                       ResultSet res =  statement.executeQuery("SELECT * FROM User1");

//   4                  ПАкетная обработка
//                statement.addBatch("INSERT INTO User1 (Email,Name) VALUES ('ADIKS902','IGOR');");
//                statement.addBatch("INSERT INTO User1 (Email,Name) VALUES ('ADIKS903','PETYA');");
//                statement.addBatch("INSERT INTO User1 (Email,Name) VALUES ('ADIKS904','VANYA');");
//                statement.executeBatch();

//   5 ?             statement.clearBatch();

//   6       ПРОВЕРЯЮ ЗАКРЫТ ЛИ НАШ СтЕЙТМЕНТ
//               boolean status =  statement.isClosed();
//               System.out.println(status);

//   7        getConnection() -> с помощью его мы получаем доступ к базе данных
//            statement.getConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

