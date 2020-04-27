import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

class Database {
    
    private final Connection con;
    
    Database(String host, String user, String password) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        con = DriverManager.getConnection(host, user, password);
    }
    
    private String[][] get(String SQL, int length) throws SQLException {
        ArrayList<String[]> res = new ArrayList();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(SQL);
        while(rs.next()) {
            String[] ress = new String[length];
            for(int i = 0; i < length; i++)
                ress[i] = rs.getString(i+1);
            res.add(ress);
        }
        
        String[][] r = new String[res.size()][length];
        for(int i = 0; i < r.length; i++) r[i] = (String[]) res.get(i);
        return r;
    }
    
    private void set(String SQL) throws SQLException {
        Statement stmt = con.createStatement();
        stmt.executeUpdate(SQL);
    }
    
    public String[][] select(String items, String table) throws SQLException {
        return get("SELECT "+items+" FROM "+table, items.split(", ?").length);
    }
    
    public String[][] select(String items, String table, String condition) throws SQLException {
        return get("SELECT "+items+" FROM "+table+" WHERE "+condition, items.split(", ?").length);
    }
    
    public void insert(String items, String table) throws SQLException {
        set("INSERT INTO "+table+" VALUES ("+items+")");
    }
    
    public void insert(String items, String colums, String table) throws SQLException {
        set("INSERT INTO "+table+" ("+colums+") VALUES ("+items+")");
    }
    
    public void update(String items, String colums, String condition, String table) throws SQLException {
        String setter = "";
        for(int i = 0; i < (colums.contains(", ") ? colums.split(", ").length : 1); i++)
            setter+=colums.split(", ")[i]+" = "+items.split(", ")[i]+", ";
        
        setter = setter.substring(0, setter.length()-2);
        
        set("UPDATE "+table+" SET "+setter+" WHERE "+condition);
    }
}
