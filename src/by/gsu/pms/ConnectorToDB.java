package by.gsu.pms;

import javax.sql.rowset.serial.SerialBlob;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static by.gsu.pms.InputData.*;

public class ConnectorToDB{

    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost/store?serverTimezone=Europe/Moscow&useSSL=false";
            String username = "root";
            String password = "jhj5655565";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            Scanner scanner = new Scanner(System.in);

            // команда создания таблицы
            String sqlCommand = "CREATE TABLE book (Id INT PRIMARY KEY AUTO_INCREMENT, AuthorName VARCHAR(100), YearOfBook INT, Text BLOB)";
//
//            System.out.print("Input number: ");
//            Integer number = scanner.nextInt();


            try (Connection conn = DriverManager.getConnection(url, username, password)){

                Statement statement = conn.createStatement();
                // создание таблицы
             //  statement.executeUpdate(sqlCommand);
              // System.out.println("Database has been created!");

//                List<String> t = Collections.singletonList("I this" + "\n" + "text!" + "\n" + "!");
//                int rows = statement.executeUpdate("INSERT book(AuthorName,YearOfBook,Text) " +
//                        "VALUES ('Blok',1333,'"+ t +"')");
//                //   "VALUES ('"+text+"')");


//                if (number == 1) {
                    AddQuery.Data();
                    String name = InputData.getName();
                    String text = InputData.getText();
                    int year = InputData.getYear();
                    //Добавление данных в таблицу
                    int rows = statement.executeUpdate("INSERT book(AuthorName,YearOfBook,Text) " +
                            "VALUES ('" + name + "'," + year + ",'" + text + "')");
                    //   "VALUES ('"+text+"')");

                    System.out.printf("Added %d rows", rows);
              //  }

                //Обновление данных в таблице
//                int rows = statement.executeUpdate("UPDATE Products SET Price = Price - 5000");
//                System.out.printf("Updated %d rows", rows);

                //Удаление из таблицы
//                int rows = statement.executeUpdate("DELETE FROM book WHERE Id = "+ 10);
//                System.out.printf("%d row(s) deleted", rows);


                //Выбор из таблицы 1 метода с ! знаками
                //int b = 35000;
  //                else if (number == 2){

//                    System.out.print("Input search name: ");
//                    String nameSearch = scanner.nextLine();
//
//                    ResultSet resultSet = statement.executeQuery("SELECT * FROM book where AuthorName = '" + nameSearch + "'");
//                    while (resultSet.next()) {
//
//                        //  int id = resultSet.getInt("Id");
//                        String nameS = resultSet.getString("AuthorName");
//                        int yearS = resultSet.getInt("YearOfBook");
//                        String blobS = resultSet.getString("Text");

//                        String lower = blobS.toLowerCase();
//                        char[] c = lower.toCharArray(); // converting to a char array
//                        int freq = 0;
//                        int tch = 0;


//                        int min = 0;


//                        for (int i = 0; i < c.length; i++) {
//                            if (c[i] == '!') // поиск строки с max количеством !
//                                 freq++;
//
//                        }
//
//                        for (int j = 0; j < c.length; j++) {
//                            if (c[j] == '.') // поиск строки с min количеством .
//                                tch++;
//                        }

//                        CollectOfPoems poemsCollect = new CollectOfPoems(blobS, '!');
//                        poemsCollect.printEachPoem();

                     //  System.out.printf(String.valueOf(max) + "\n");
                     //   System.out.printf("%s - %d - %s \n", nameS, yearS, blobS);


//                        if (freq == max) {
//                            System.out.printf("%s - %d - %s \n", nameS, yearS, blobS);
//                        }




            //        }
   //            }

                //Закрытие соединения
                conn.close();
                System.out.printf("\n" + String.valueOf(conn.isClosed()));
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }
}



