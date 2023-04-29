package com.vpdev.jdbc.starter;

import com.vpdev.jdbc.starter.util.ConnectionManager;
import org.postgresql.Driver;

import java.sql.*;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class JdbcRunner {
    public static void main(String[] args) throws SQLException {
        Class<Driver> driverClass = Driver.class;
        String sql = """
                INSERT INTO flight_repository.public.info(data)
                VALUES 
                ('autogen'),
                ('autogen'),
                ('autogen');
                                
                              
                """;

        try (Connection connection = ConnectionManager.open();
             var statement = connection.createStatement()) {
            // System.out.println(connection.getSchema());
            // System.out.println(connection.getTransactionIsolation());
            var executeResult = statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet generatedKeys = statement.getGeneratedKeys();
            while (generatedKeys.next()) {
                System.out.println(generatedKeys.getLong("id"));
            }
            // System.out.println(executeResult.);
//            while (executeResult.next())
//            {
//                System.out.println(executeResult.getLong("id"));
//                System.out.println(executeResult.getString("passenger_no"));
//                System.out.println(executeResult.getBigDecimal("cost"));
//                System.out.println("-----------------");
//            }
            // System.out.println(statement.getUpdateCount());

        }
        // System.out.println(Driver.class);


    }

}
