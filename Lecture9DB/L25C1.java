/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.cweek1;

import java.beans.Statement;
import java.sql.DriverManager;

/**
 *
 * @author Harish
 */
public class L25C1 {
       public static void main(String[]args){
        try{
            Class.forName("com.mysql.cj.jbdc.Driver");
            String connectionURL = "jbdc:mysql://localhost/booksdb";
            connection conn = DriverManager.getConnection(connectionURL,"root","Ha!@2003");
            

            int bid = 102;
            String bookTitle = "Sql Essentials";
            String author = "Jerry rig";
            int price = 295;

            String insertQuery = String.format("insert into books values(%d,'%s','%s',%d)",bid,bookTitle,author,price);
            System.out.println(insertQuery);
            //String insertQuery = "insert into values(101,'jdk by wrox', 'ivor horton',750)";

            Statement stmt = conn.createStatement();
            stmt.execute(insertQuery);
            stmt.close();

            System.out.println("connceted to server Succesfully!!");
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}
