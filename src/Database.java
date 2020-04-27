
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor
 */
class Database {
    
    private final Connection con;
    
    Database(String host, String user, String password) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        con = DriverManager.getConnection(host, user, password);
    }
    
    Object[] select(String items, String table) throws SQLException {
        ArrayList res = new ArrayList();
        Statement stmt = con.createStatement();
        String SQL = "SELECT "+items+" FROM "+table;
        ResultSet rs = stmt.executeQuery(SQL);
        while(rs.next()) {
            for(int i = 0; i < items.split(", ").length; i++)
                res.add(rs.getString(i+1));
        }
        return res.toArray();
    }
    
    int insert(String items, String table) throws SQLException {
        Statement stmt = con.createStatement();
        String SQL = "INSERT INTO "+table+" VALUES ("+items+")";
        return stmt.executeUpdate(SQL);
    }
    
    int insert(String items, String colums, String table) throws SQLException {
        Statement stmt = con.createStatement();
        String SQL = "INSERT INTO "+table+" ("+colums+") VALUES ("+items+")";
        return stmt.executeUpdate(SQL);
    }
    
    int update(String items, String colums, String condition, String table) throws SQLException {
        Statement stmt = con.createStatement();
        String setter = "";
        int lngth = colums.contains(", ") ? colums.split(", ").length : 1;
        for(int i = 0; i < lngth; i++)
            setter+=colums.split(", ")[i]+" = "+items.split(", ")[i]+", ";
        setter = setter.substring(0, setter.length()-2);
        System.out.println(setter);
        String SQL = "UPDATE "+table+" SET "+setter+" WHERE "+condition;
        return stmt.executeUpdate(SQL);
    }
}
