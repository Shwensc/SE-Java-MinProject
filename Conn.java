package food.ordering.system;

import java.sql.*;

public class Conn {
    
    Connection c;// c -> Establish Database Connection.
    Statement s;// s ->used for executing SQL statements against the database.

    public Conn () {
        // Exception handling 
        try {
            Class.forName("org.postgresql.Driver");
            //registers the PostgreSQL JDBC driver with the Java application.
            c = DriverManager.getConnection("jdbc:postgresql://localhost/foodorder", "foodorderuser", "foodorderuser");
            // a connection to the PostgreSQL database is established
            s = c.createStatement();
            // Once it is Sucessfully connected a 'Statement' object gets created 
            // This "Statement" object can be used to execute SQL queries on the database.
        } catch (Exception e) {
            e.printStackTrace();
           //If any exceptions occur during the connection process, they will be caught in the catch block.
           //The e.printStackTrace() statement is used to print the exception details.
        }
    }
}
