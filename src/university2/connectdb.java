
package university2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class connectdb {
    
    private static final String user="root";
    private static final String pass="sys";
    private static final  String url="jdbc:mysql://localhost/university2";
    private static Connection c;
    
    
    public static Connection connect(){
    
        try {
            c = DriverManager.getConnection(url, user, pass);

        } catch (SQLException ex) {
                        System.out.println(ex.getMessage());

        }
         return c;
    }
}
