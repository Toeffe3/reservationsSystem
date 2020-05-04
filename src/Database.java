import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

class Database {
    
    private final Connection con;
    
    /**
     * Initilize a connection to a sql database
     * @param host protocol, hostname and port should be specified
     * @param user username, required
     * @param password, password, reqired
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    Database(String host, String user, String password) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        con = DriverManager.getConnection(host, user, password);
    }
    
    /**
     * Execute a sql-query and retrives the return value
     * @param SQL query to execute as string
     * @param length amount of results expected to be returned
     * @return sql-querys return value
     * @throws SQLException 
     */
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
    
    /**
     * Execute a sql-query
     * @param SQL query to execute as string
     * @throws SQLException 
     */
    private void set(String SQL) throws SQLException {
        Statement stmt = con.createStatement();
        stmt.executeUpdate(SQL);
    }
    
    /**
     * Get data in specified columns from table
     * @param columns columns seperated with commas
     * @param table table name
     * @return
     * @throws SQLException 
     */
    public String[][] select(String columns, String table) throws SQLException {
        return get("SELECT "+columns+" FROM "+table, columns.split(", ?").length);
    }
    
    /**
     * Get data in specified columns from table, with/on conditions
     * @param columns columns seperated with commas
     * @param table table name
     * @param condition sql phrase such as WHERE or INNER JOIN
     * @return array with each match represented as an array
     * @throws SQLException 
     */
    public String[][] select(String columns, String table, String condition) throws SQLException {
        return get("SELECT "+columns+" FROM "+table+" "+condition, columns.split(", ?").length);
    }
    
    /**
     * Inserts new row into table
     * @param items values as string seperated with commas 
     * @param table table name
     * @throws SQLException 
     */
    public void insert(String items, String table) throws SQLException {
        set("INSERT INTO "+table+" VALUES ("+items+")");
    }
    
    /**
     * Insert values into specified columns
     * @param items values as string seperated with commas
     * @param colums column names seperated with commas
     * @param table table name
     * @throws SQLException 
     */
    public void insert(String items, String colums, String table) throws SQLException {
        set("INSERT INTO "+table+" ("+colums+") VALUES ("+items+")");
    }
    
    /**
     * Updates values in a table
     * @param items values seperated with commas (string values should be encapsuled with apostrophes)
     * @param columns column names sepperated with commas
     * @param condition WHERE condition
     * @param table sql table name
     * @throws SQLException 
     */
    public void update(String items, String columns, String condition, String table) throws SQLException {
        String setter = "";
        for(int i = 0; i < (columns.contains(", ") ? columns.split(", ").length : 1); i++)
            setter+=columns.split(", ")[i]+" = "+items.split(", ")[i]+", ";
        
        setter = setter.substring(0, setter.length()-2);
        set("UPDATE "+table+" SET "+setter+" WHERE "+condition);
    }
    
    /**
     * Creates all tables and insert dummy data
     * @param reset if true DROP all tables before creating them (to avoid errors)
     * @throws SQLException 
     */
    public void createTables(boolean reset) throws SQLException {
        if(reset) {
            set("DROP TABLE BIOGRAFER");
            set("DROP TABLE FILM");
            set("DROP TABLE OVERSIGT");
        }
        
        set("CREATE TABLE BIOGRAFER (ID INT, NAVN VARCHAR(255))");
        set("CREATE TABLE FILM (NUMMER INT, FILMID INT, SÆDER VARCHAR(255), RÆKKER INT, SAL INT, BIOGRAF INT, START TIMESTAMP)");
        set("CREATE TABLE OVERSIGT (FILM INT, NAVN VARCHAR(255))");
        
        insertBulk(new String[]{
            "0,'Kolding'",
            "1,'Esbjerg'",
            "2,'Aarhus'",
            "3,'Odense'",
            "4,'København'"
        }, "BIOGRAFER");
        
        insertBulk(new String[]{
            "0,0,'bgcc16qk4',10,4,0,'2020-10-05 20:00:00'",
            "1,0,'abab123',16,1,1,'2020-10-05 20:00:00'",
            "2,1,'15fpgfbk1vvap',10,4,0,'2020-10-05 20:00:00'",
            "3,1,'15fpgfbk1vvap',13,1,2,'2020-10-05 20:00:00'",
            "4,2,'15fpgfbk1vvap',10,2,2,'2020-10-05 20:00:00'",
            "5,3,'15fpgfbk1vvap',14,1,3,'2020-10-05 20:00:00'",
            "6,4,'15fpgfbk1vvap',8,3,0,'2020-10-05 20:00:00'",
            "7,4,'15fpgfbk1vvap',8,3,1,'2020-10-05 20:00:00'",
            "8,4,'15fpgfbk1vvap',13,1,2,'2020-10-05 20:00:00'",
            "9,4,'15fpgfbk1vvap',15,2,3,'2020-10-05 20:00:00'",
            "10,4,'15fpgfbk1vvap',16,1,4,'2020-10-05 20:00:00'"
        }, "FILM");
        
        insertBulk(new String[]{
            "0,'Find Nemo'",
            "1,'The Matrix'",
            "2,'Jurassic Park'",
            "3,'Jumanji 2'",
            "4,'Sonic the Hedhog'"
        }, "OVERSIGT");
    }
    
    /**
     * Creates a new row for each element in array into table
     * @param bulk array with comma-seperated values as string
     * @param table table name
     * @throws SQLException 
     */
    public void insertBulk(String[] bulk, String table) throws SQLException {
        for(String item : bulk) insert(item, table);
    }
    
}
