package controllers;


import java.sql.SQLException;

import database.Database;


public class Parent extends Database{
    public Parent() throws ClassNotFoundException, SQLException {
        super();
    } 
    
        
    // Create
    public void insertParent(String nama, String alamat, String gender) throws SQLException {
        String sql = String.format("INSERT INTO parent (nama, alamat, gender) VALUE ('%s', '%s', '%s')", nama,
                alamat, gender);
        this.setQuery(sql);
        this.execute();
    }

    // Read
    public void getAll() throws SQLException {
        String sql = "SELECT * FROM parent";
        this.setQuery(sql);
        this.fetch();
    }
    
    // Update
    public void updateParent(String nama, String alamat, String gender) throws SQLException {
        String sql = String.format("UPDATE parent SET alamat = '%s' , gender = '%s' WHERE nama = '%s'", alamat, gender, nama);
        this.setQuery(sql);
        this.execute();
    }

    // Delete
    public void deleteParent(String id) throws SQLException {
        String sql = String.format("DELETE FROM parent WHERE nama = '%s'", id);
        this.setQuery(sql);
        this.execute();
    }

    // Validation untuk mencegah redudansi data
    public boolean checkParent(String nama) throws SQLException {
        getAll();
        while (this.value.next()) {
            if (this.value.getString("parent") == nama) {
                return false;
            }
        }
        return true;
    }

    // Print Suster
    public String[][] showParent() throws SQLException {
        String[][] data = new String[this.lenParent()][3];
        getAll();
        this.fetch();
        int i = 0;
        while (this.value.next()) { 
            data[i][0] = this.value.getString("nama");
            data[i][1] = this.value.getString("alamat");
            data[i][2] = this.value.getString("gender");
            i++;
        }
        return data;
    }
    
    public int lenParent() throws SQLException {
        getAll();
        this.fetch();
        int i = 0;
        while (this.value.next()) {
            i++;
        }
        return i;
    }
}
