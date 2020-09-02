package com.mycompagny.tennis.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;

public class TestDeConnection {
    public static void main(String... args){
        Connection conn = null;
        try {
        	BasicDataSource dataSource=new BasicDataSource();
        	dataSource.setInitialSize(5);
        	dataSource.setUrl("jdbc:mysql://localhost:3306/tennis?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=Europe/Paris");
        	dataSource.setUsername("root");
        	dataSource.setPassword("");
        	
        	conn=dataSource.getConnection();
            //Seulement avant Java 7/JDBC 4 
            //Class.forName(DRIVER_CLASS_NAME);
            
            //MySQL driver MySQL Connector
            //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tennis?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=Europe/Paris","root","");
            //Oracle Driver officiel OJDBC Thin
            //conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:tennis","COURSDB","COURSDB");
            //Postgres Driver officiel
            //conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tennis","COURSDB","COURSDB");
            Statement statement=conn.createStatement();
            ResultSet rs=statement.executeQuery("SELECT NOM,PRENOM,ID FROM JOUEUR");
            
            while(rs.next()) {
            	String nom=rs.getString("NOM");
            	String prenom=rs.getString("PRENOM");
            	int id=rs.getInt("ID");
            	System.out.println("le joueur numero "+id+" est "+prenom+" "+nom);
            }
            
            System.out.println("success");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (conn!=null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

