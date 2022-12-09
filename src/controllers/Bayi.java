package controllers;

import java.sql.SQLException;

import database.Database;

public class Bayi extends Database {
    // Constructor untuk Connect ke Database
    public Bayi() throws ClassNotFoundException, SQLException {
        super();
        //super asalnya dri mana 
    }

    // Create
    public void insertbayi(String nama, String ortu, String usia, String alergi) throws SQLException {
        String sql = String.format("INSERT INTO bayi (nama_bayi, nama_ortu, usia_bayi, alergi) VALUE ('%s', '%s', '%s', '%s')", nama, ortu,
                usia, alergi);
        this.execute();
    }

    // Read
    public void getAll() throws SQLException {
        String sql = "SELECT * FROM bayi";
        this.setQuery(sql);
        this.fetch();
    }
    
    // Update
    public void updatebayi(int id, String nama, String ortu, String usia, String alergi) throws SQLException {
        String sql = String.format("UPDATE bayi SET nama_bayi = '%s', nama_ortu = '%s', usia_bayi = '%s', alergi = '%s' WHERE id_penitipan = %d",
                
                nama, ortu, usia, alergi,  id);
        this.setQuery(sql);
        this.execute();
    }

    // Delete
    public void deletebayi(int id) throws SQLException {
        String sql = String.format("DELETE FROM bayi WHERE id_penitipan = %d", id);
        this.setQuery(sql);
        this.execute();
    }

    // Validation untuk mencegah redudansi data
    public boolean checkbayi(String nama) throws SQLException {
        getAll();
        while (this.value.next()) {
            if (this.value.getString("bayi") == nama) {
                return false;
            }
        }
        return true;
    }

    // Print bayi
    public String[][] showbayi() throws SQLException {
        String[][] data = new String[this.lenbayi()][5];
        getAll();
        this.fetch();
        int i = 0;
        while (this.value.next()) {
            data[i][0] = Integer.toString(this.value.getInt("id_penitipan"));
            data[i][1] = this.value.getString("nama_bayi");
            data[i][2] = this.value.getString("nama_ortu");
            data[i][3] = this.value.getString("usia_bayi");
            data[i][4] = this.value.getString("alergi");
            i++;
        }
        return data;
    }
    
    public int lenbayi() throws SQLException {
    
        getAll();
        this.fetch();
        int i = 0;
        while (this.value.next()) {
            i++;
        }
        return i;
    }
}
