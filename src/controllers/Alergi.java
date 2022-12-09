package controllers;

import java.sql.SQLException;
import database.Database;

public class Alergi extends Database{
    
    public Alergi() throws SQLException, ClassNotFoundException {
        super();
    }
    
    public void getAll() throws SQLException {
        String sql = "SELECT * FROM data_alergi";
        this.setQuery(sql);
        this.fetch();
    }
    
    public String[][] showAlergi() throws SQLException {
        String[][] data = new String[this.lenAlergi()][2];
        getAll();
        this.fetch();
        int i = 0;
        while (this.value.next()) {
            data[i][0] = this.value.getString("Nama_alergi");
            data[i][1] = this.value.getString("Cara_penanganan");
            i++;
        }
        return data;
    }
    
    public int lenAlergi() throws SQLException {
        getAll();
        this.fetch();
        int i = 0;
        while (this.value.next()) {
            i++;
        }
        return i;
    }
}
