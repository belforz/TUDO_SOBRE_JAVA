/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio_chat;
import java.sql.*;

/**
 *
 * @author maced
 */
public class Desafio_chat {

    public static void main(String[] args) {
      try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/desafio_chatgpt?zeroDateTimeBehavior=CONVERT_TO_NULL","root",""); 
      String chat_Insert2 = "INSERT INTO students(name, age, course) VALUES('Joao',18,'Computer Science');";
      String chat_Insert3 = "INSERT INTO students(name, age, course) VALUES('Joaozinho',12,'Ensino Medio');";
      String chat_Inserts = chat_Insert2 + chat_Insert3;
      Statement smtm = con.createStatement();
      int rowsAffected = smtm.executeUpdate(chat_Inserts);
      if (rowsAffected ==1){
          System.out.println("Sucessfuly done");
      }
      else {
          System.out.println("erro");
      }
          
      } catch (Exception e){
            System.out.println(e);}
    }
    
}
