import java.sql.*;

public class SQLITE {
    private static Connection _con = null;

    public static void getConnection(){
        try {
            
            String database_path = "Enter here path to your database";
            _con = DriverManager.getConnection("jdbc:sqlite:" + database_path);
        } catch(SQLException error){
            System.err.print(error.getMessage());
        }
    }
    
    // retrieve data from database
    public static ResultSet getData(String query){
        ResultSet data = null;
        if(_con == null) getConnection();

        try{
            data = _con.createStatement().executeQuery(query);
        } catch (SQLException error){
            System.err.print(error.getMessage());
        }

        return  data;
    }
    
    // insert, update and delete data in database
    public static int execute(String query){
        int result = -1;
        if(_con == null) getConnection();

        try{
            result = _con.createStatement().executeUpdate(query);
        } catch (SQLException error){
            System.err.print(error.getMessage());
        }

        return result;
    }
}
