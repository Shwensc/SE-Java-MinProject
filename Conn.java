package food.ordering.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost/foodorder", "foodorderuser", "foodorderuser");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
