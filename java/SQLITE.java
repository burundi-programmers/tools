package App;

import java.sql.*;

public class SQLITE {
    private static Connection _con = null;

    public static void get_connection(){
        try {
            String _db_url = "jdbc:sqlite:C:\\src\\databases\\gestion_patients.db";
            _con = DriverManager.getConnection(_db_url);
        } catch(SQLException error){
            System.err.print(error.getMessage());
        }
    }

    public static ResultSet get_data(String query){
        ResultSet data = null;
        if(_con == null) get_connection();

        try{
            data = _con.createStatement().executeQuery(query);
        } catch (SQLException error){
            System.err.print(error.getMessage());
        }

        return  data;
    }

    public static int insert_data(String query){
        int result = -1;
        if(_con == null) get_connection();

        try{
            result = _con.createStatement().executeUpdate(query);
        } catch (SQLException error){
            System.err.print(error.getMessage());
        }

        return result;
    }
}
