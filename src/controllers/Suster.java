
package controllers;

import java.sql.SQLException;

import database.Database;

//Nama, Umur, Alamat, LamaKerja

public class Suster extends Database{
    public Suster() throws ClassNotFoundException, SQLException {
        super();
    }
    
    // Create
    public void insertSuster(String nama, String alamat, String usia, String durasi) throws SQLException {
        String sql = String.format("INSERT INTO suster (nama, alamat, usia, lama_kerja) VALUE ('%s', '%s', '%s', '%s')", nama,
                usia, alamat, durasi);
        this.setQuery(sql);
        this.execute();
    }

    // Read
    public void getAll() throws SQLException {
        String sql = "SELECT * FROM suster";
        this.setQuery(sql);
        this.fetch();
    }
    
    // Update
    public void updateSuster(String nama, String usia, String alamat, String lama_kerja) throws SQLException {
        String sql = String.format("UPDATE suster SET usia = '%s' , alamat = '%s', lama_kerja = '%s' WHERE nama = '%s'",
                usia, alamat, lama_kerja, nama);
        this.setQuery(sql);
        this.execute();
    }

    // Delete
    public void deleteSuster(String nama) throws SQLException {
        String sql = String.format("DELETE FROM suster WHERE nama  = '%s'", nama);
        this.execute();
    }

    // Validation untuk mencegah redudansi data
    public boolean checkSuster(String nama) throws SQLException {
        getAll();
        while (this.value.next()) {
            if (this.value.getString("suster") == nama) {
                return false;
            }
        }
        return true;
    }
    
    // Print Suster
    public String[][] showSuster() throws SQLException {
        String[][] data = new String[this.lenSuster()][4];
        getAll();
        this.fetch();
        int i = 0;
        while (this.value.next()) {
            data[i][0] = this.value.getString("nama");
            data[i][1] = this.value.getString("usia");
            data[i][2] = this.value.getString("alamat");
            data[i][3] = this.value.getString("lama_kerja");
            i++;
        }
        return data;
    }
    
    public int lenSuster() throws SQLException {
        getAll();
        this.fetch();
        int i = 0;
        while (this.value.next()) {
            i++;
        }
        return i;
    }
}
