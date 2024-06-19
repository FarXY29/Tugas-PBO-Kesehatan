    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import java.security.Timestamp;
import java.sql.Connection; // mendapatkan koneksi
import java.sql.DriverManager; // menghubungkan database
import java.sql.PreparedStatement; // perintah sql (CRUD)
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Hambali
 */
public class database {
    private String databasename = "muhammad hambali t._2210010154";
    private String username = "root";
    private String password = "";
    public static Connection connectionDB;
    
    
    public database(){
        try {
            String location = "jdbc:mysql://localhost/" + databasename;
            Class.forName("com.mysql.jdbc.Driver");
            connectionDB = DriverManager.getConnection(location, username, password);
            System.out.println("Database Terkoneksi");
           
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void simpanuji(String nik, String nama, String telp, String alamat){
        try {
            String sql = "insert into uji(nik, nama, telp, alamat) value(?,?,?,?) ";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nik);
            perintah.setString(2, nama);
            perintah.setString(3, telp);
            perintah.setString(4, alamat);
            
            perintah.executeUpdate();
            System.out.println("Data berhasil tersimpan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void ubahuji(String nik, String nama, String telp, String alamat){
        try {
            String sql = "Update uji set nama = ?, telp = ?, alamat = ? where nik = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nama);
            perintah.setString(2, telp);
            perintah.setString(3, alamat);
            perintah.setString(4, nik);
            
            perintah.executeUpdate();
            System.out.println("Data berhasil terubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void hapusuji(String nik){
        try {
            String sql = "delete from uji where nik = 1";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    } 
    
    //Tabel Gizi
    public void simpangizi(String kode_gizi, String nama_gizi, String kode_timbangan, String kode_individu){
        try {
            String sql = "insert into gizi(kode_gizi, nama_gizi, kode_timbangan, kode_individu) value(?,?,?,?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, kode_gizi);
            perintah.setString(2, nama_gizi);
            perintah.setString(3, kode_timbangan);
            perintah.setString(4, kode_individu);
            
            perintah.executeUpdate();
            System.out.println("Data berhasil tersimpan");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void ubahgizi(String kode_gizi, String nama_gizi, String kode_timbangan, String kode_individu){
        try {
            String sql = "Update gizi set nama_gizi = ?, kode_timbangan = ?, kode_individu = ? where kode_gizi = ?" ;
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nama_gizi);
            perintah.setString(2, kode_timbangan);
            perintah.setString(3, kode_individu);
            perintah.setString(4, kode_gizi);
            
            perintah.executeUpdate();
            System.out.println("Data berhasil tersimpan");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void hapusgizi(String kode_gizi){
        try {
            String sql = "delete from gizi where kode_gizi = 1";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void carigizi(String kode_gizi){
        try {
            String sql="select * from gizi where kode_gizi=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, kode_gizi);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("Kode Gizi :"+data.getString("kode_gizi"));
                System.out.println("Nama Gizi :"+data.getString("nama_gizi"));
                System.out.println("Kode Timbangan :"+data.getString("kode_timbangan"));
                System.out.println("Kode Individu :"+data.getString("kode_individu"));
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void datagizi(){
        try {
            Statement stmt = connectionDB.createStatement();
            ResultSet baris = stmt.executeQuery("select*from gizi order by kode_gizi ASC");
            while(baris.next()){
                System.out.println(baris.getString("kode_gizi")+"|"+
                    baris.getString("nama_gizi")+"|"+
                    baris.getString("kode_timbangan")+"|"+
                    baris.getString("kode_individu"));        
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    // Tabel Kader
    public void simpankader(String kode_kader, String nama_kader){
        try {
            String sql = "insert into kader(kode_kader, nama_kader) value(?,?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, kode_kader);
            perintah.setString(2, nama_kader);
            
            perintah.executeUpdate();
            System.out.println("Data berhasil tersimpan");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
        public void ubahkader(String kode_kader, String nama_kader){
        try {
            String sql = "Update kader set nama_kader = ? where kode_kader = ?" ;
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nama_kader);
            perintah.setString(2, kode_kader);
            
            perintah.executeUpdate();
            System.out.println("Data berhasil tersimpan");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void hapuskader(String kode_kader){
        try {
            String sql = "delete from kader where kode_kader = 1";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void carikader(String kode_kader){
        try {
            String sql="select * from kader where kode_kader=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, kode_kader);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("Kode Kader :"+data.getString("kode_kader"));
                System.out.println("Nama Kader :"+data.getString("nama_kader"));
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void datakader(){
        try {
            Statement stmt = connectionDB.createStatement();
            ResultSet baris = stmt.executeQuery("select*from kader order by kode_kader ASC");
            while(baris.next()){
                System.out.println(baris.getString("kode_kader")+"|"+
                    baris.getString("nama_kader"));        
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    // Tabel KMS
    public void simpankms(String kode_kms, String keterangan, String kode_individu){
        try {
            String sql = "insert into kms(kode_kms, keterangan, kode_individu) value(?,?,?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, kode_kms);
            perintah.setString(2, keterangan);
            perintah.setString(3, kode_individu);
            
            perintah.executeUpdate();
            System.out.println("Data berhasil tersimpan");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
        public void ubahkms(String kode_kms, String keterangan, String kode_individu){
        try {
            String sql = "Update kms set keterangan = ?, kode_individu = ? where kode_kms = ?" ;
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, keterangan);
            perintah.setString(2, kode_individu);
            perintah.setString(3, kode_kms);
            
            perintah.executeUpdate();
            System.out.println("Data berhasil tersimpan");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void hapuskms(String kode_kms){
        try {
            String sql = "delete from kms where kode_kms = 1";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void carikms(String kode_kms){
        try {
            String sql="select * from kms where kode_kms=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, kode_kms);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("Kode KMS :"+data.getString("kode_kms"));
                System.out.println("Keterangan :"+data.getString("keterangan"));
                System.out.println("Kode Individu :"+data.getString("kode_individu"));
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void datakms(){
        try {
            Statement stmt = connectionDB.createStatement();
            ResultSet baris = stmt.executeQuery("select*from kms order by kode_kms ASC");
            while(baris.next()){
                System.out.println(baris.getString("kode_kms")+"|"+
                    baris.getString("keterangan")+"|"+
                    baris.getString("kode_individu"));        
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //Tabel Individu
    public void simpanindividu(String kode_individu, String nama_lengkap, String tgl_lahir, String nama_ayah, 
            String nama_ibu, String berat_badan, String tinggi_badan, String kms, String kode_kader){
        try {
            String sql = "insert into individu(kode_individu, nama_lengkap, tgl_lahir, nama_ayah, nama_ibu, berat_badan, tinggi_badan, kms, kode_kader) value(?,?,?,?,?,?,?,?,?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, kode_individu);
            perintah.setString(2, nama_lengkap);
            perintah.setString(3, tgl_lahir);
            perintah.setString(4, nama_ayah);
            perintah.setString(5, nama_ibu);
            perintah.setString(6, berat_badan);
            perintah.setString(7, tinggi_badan);
            perintah.setString(8, kms);
            perintah.setString(9, kode_kader);
            
            perintah.executeUpdate();
            System.out.println("Data berhasil tersimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
        public void ubahindividu(String kode_individu, String nama_lengkap, String tgl_lahir, String nama_ayah, 
            String nama_ibu, String berat_badan, String tinggi_badan, String kms, String kode_kader){
        try {
            String sql = "Update individu set nama_lengkap = ?, tgl_lahir = ?, nama_ayah = ?, nama_ibu = ?, berat_badan = ?, tinggi_badan = ?, kms = ?, kode_kader = ? where kode_individu = ?" ;
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nama_lengkap);
            perintah.setString(2, tgl_lahir);
            perintah.setString(3, nama_ayah);
            perintah.setString(4, nama_ibu);
            perintah.setString(5, berat_badan);
            perintah.setString(6, tinggi_badan); 
            perintah.setString(7, kms);
            perintah.setString(8, kode_kader);
            perintah.setString(9, kode_individu);            
            
            perintah.executeUpdate();
            System.out.println("Data berhasil tersimpan");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void hapusindividu(String kode_individu){
        try {
            String sql = "delete from individu where kode_individu = 1";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void cariindividu(String kode_individu){
        try {
            String sql="select * from individu where kode_individu=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, kode_individu);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("Kode Individu :"+data.getString("kode_individu"));
                System.out.println("Nama Lengkap :"+data.getString("nama_lengkap"));
                System.out.println("Tanggal Lahir :"+data.getString("tgl_lahir"));
                System.out.println("Nama Ayah :"+data.getString("nama_ayah"));
                System.out.println("Nama Ibu :"+data.getString("nama_ibu"));
                System.out.println("Berat Badan :"+data.getString("berat_badan"));
                System.out.println("Tinggi Badan :"+data.getString("tinggi_badan"));
                System.out.println("KMS :"+data.getString("kms"));
                System.out.println("Kode Kader :"+data.getString("kode_kader"));
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void dataindividu(){
        try {
            Statement stmt = connectionDB.createStatement();
            ResultSet baris = stmt.executeQuery("select*from individu order by kode_individu ASC");
            while(baris.next()){
                System.out.println(baris.getString("kode_individu")+"|"+
                    baris.getString("nama_lengkap")+"|"+
                    baris.getString("tgl_lahir")+"|"+
                    baris.getString("nama_ayah")+"|"+
                    baris.getString("nama_ibu")+"|"+
                    baris.getString("berat_badan")+"|"+
                    baris.getString("tinggi_badan")+"|"+
                    baris.getString("kms")+"|"+
                    baris.getString("kode_kader"));        
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
