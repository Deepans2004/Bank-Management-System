//class for JDBC connectivity
package Bank.Management.System;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class conn {
    Connection c;
    Statement s;
    public conn(){
        try {
            //register the deriver
            //create the connection
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Qwert@#12345");
           //create statement
            s=c.createStatement();
        } catch(Exception e){
            System.out.println(e);
        }
    }

}
