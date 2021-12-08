package DataBase;

import java.sql.*;
import java.util.Scanner;
import java.io.*;

public class DatabaseConnection {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);

        try {
            //load the driver
            Class.forName("com.mysql.jdbc.Driver");

            //creating a connection
            String url = "jdbc:mysql://localhost:3306/testconnection";
            String username = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url, username, password);
            if (con.isClosed()) {
                System.out.println("Connection is Closed.");
            } else {
                System.out.println("Connection created....");
            }
            con.isClosed();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();

        System.out.println("Which part you want to see?\n 1. Create Table\n 2. Insert Data"
                + "\n 3. Insert Name and City\n 4. Create Image Table\n 5. Insert small Image <65kb"
                + "\n 6. Insert Long Image table \n 7. Insert long Image ");
        int choice = input.nextInt();

        switch (choice) {
            //create first table
            case 1:
                try {
                //load the driver
                Class.forName("com.mysql.jdbc.Driver");

                //creating a connection
                String url = "jdbc:mysql://localhost:3306/testconnection";
                String username = "root";
                String password = "root";
                Connection con = DriverManager.getConnection(url, username, password);
                //create a table
                String q = "CREATE TABLE table1(tId int(20) PRIMARY KEY AUTO_INCREMENT,"
                        + "tName varchar(200) NOT NULL,tCity varchar(400))";
                Statement stmt = con.createStatement();
                stmt.executeUpdate(q);
                System.out.println("Table created in Dtabase.");
                con.isClosed();

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            break;

            case 2:
                //insert first table data
                try {
                //load the driver
                Class.forName("com.mysql.jdbc.Driver");

                //creating a connection
                String url = "jdbc:mysql://localhost:3306/testconnection";
                String username = "root";
                String password = "root";
                Connection con = DriverManager.getConnection(url, username, password);
                //Insert Data in the table

                String sql = "INSERT INTO table1(tName,tCity)VALUES(?,?)";
                //get the PreparedStatement
                
                //when we work with preparedStatement  we will pass the sql query
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, "Tanmoy Shome");
                pstmt.setString(2, "Bangladesh");

                pstmt.executeUpdate();
                System.out.println("Insert all data.");
                con.isClosed();

            } catch (Exception e) {
                e.printStackTrace();
            }
            break;

            case 3:
                //insert any name and city
                 try {
                //load the driver
                Class.forName("com.mysql.jdbc.Driver");

                //creating a connection
                String url = "jdbc:mysql://localhost:3306/testconnection";
                String username = "root";
                String password = "root";
                Connection con = DriverManager.getConnection(url, username, password);
                //Insert Data in the table

                String sql = "INSERT INTO table1(tName,tCity)VALUES(?,?)";
                //get the PreparedStatement
                PreparedStatement pstmt = con.prepareStatement(sql); //when we work with preparedStatement  we will pass the sql query
                //BufferedReader
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Name: ");
                String name = br.readLine();
                System.out.println("Enter City: ");
                String city = br.readLine();

                pstmt.setString(1, name);
                pstmt.setString(2, city);

                pstmt.executeUpdate();
                System.out.println("Inserting Data....");
                con.isClosed();

            } catch (Exception e) {
                e.printStackTrace();
            }
            break;

            case 4:
                //creae image table
                 try {
                //load the driver
                Class.forName("com.mysql.jdbc.Driver");

                //creating a connection
                String url = "jdbc:mysql://localhost:3306/testconnection";
                String username = "root";
                String password = "root";
                Connection con = DriverManager.getConnection(url, username, password);
                //create a table with Image
                String q = "CREATE TABLE table2(tId int(20) PRIMARY KEY AUTO_INCREMENT,"
                        + "tImg blob)";
                Statement stmt = con.createStatement();
                stmt.executeUpdate(q);
                System.out.println("Table for image created in Database.");
                con.isClosed();

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            break;

            case 5:
                //insert small image
                 try {
                //load the driver
                Class.forName("com.mysql.jdbc.Driver");

                //creating a connection
                String url = "jdbc:mysql://localhost:3306/testconnection";
                String username = "root";
                String password = "root";
                Connection con = DriverManager.getConnection(url, username, password);
                //Insert Data in the table

                String sql = "INSERT INTO table2(tImg)VALUES(?)";
                //get the PreparedStatement
                PreparedStatement pstmt = con.prepareStatement(sql); //when we work with preparedStatement  we will pass the sql query

                //fill input
                FileInputStream file = new FileInputStream("C:\\Users\\User\\OneDrive\\Documents\\NetBeansProjects\\DataBase Connection\\src\\DataBase\\nature.jpg");

                pstmt.setBinaryStream(1, file, file.available());

                pstmt.executeUpdate();
                System.out.println("Inserting Image....");
                con.isClosed();

            } catch (Exception e) {
                e.printStackTrace();
            }

            break;
            case 6:
                 //creae long image table
                 try {
                //load the driver
                Class.forName("com.mysql.jdbc.Driver");

                //creating a connection
                String url = "jdbc:mysql://localhost:3306/testconnection";
                String username = "root";
                String password = "root";
                Connection con = DriverManager.getConnection(url, username, password);
                //create a table with Image
                String q = "CREATE TABLE table3(tId int(20) PRIMARY KEY AUTO_INCREMENT,"
                        + "tImg longblob)";
                Statement stmt = con.createStatement();
                stmt.executeUpdate(q);
                System.out.println("Table for image created in Database.");
                con.isClosed();

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            case 7:
                //insert small image
                 try {
                //load the driver
                Class.forName("com.mysql.jdbc.Driver");

                //creating a connection
                String url = "jdbc:mysql://localhost:3306/testconnection";
                String username = "root";
                String password = "root";
                Connection con = DriverManager.getConnection(url, username, password);
                //Insert Data in the table

                String sql = "INSERT INTO table3(tImg)VALUES(?)";
                //get the PreparedStatement
                PreparedStatement pstmt = con.prepareStatement(sql); //when we work with preparedStatement  we will pass the sql query

                //fill input
                FileInputStream file = new FileInputStream("C:\\Users\\User\\OneDrive\\Documents\\NetBeansProjects\\DataBase Connection\\src\\DataBase\\annadoll.jpg");

                pstmt.setBinaryStream(1, file, file.available());

                pstmt.executeUpdate();
                System.out.println("Inserting long Image....");
                con.isClosed();

            } catch (Exception e) {
                e.printStackTrace();
            }

            break;

            default:
                System.out.println("You shoulld Select right Selection.");

        }
    }
}
