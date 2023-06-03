/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.sql.*;
import java.sql.Connection;

/**
 *
 * @author mohamed
 */
public class DBconnection {

private static final String url = "jdbc:mysql://localhost:3306/DB";
private static final String username = "root";
private static final String password = "password";



 public static Connection connecttodb(){ 
   
 System.out.println("Connecting database...");

 try  {
     System.out.println("Database connected!");
     return  DriverManager.getConnection(url, username, password);
          

 } catch (SQLException e) {
     throw new IllegalStateException("Cannot connect the database!", e);
 
       }
    
    
 }}
