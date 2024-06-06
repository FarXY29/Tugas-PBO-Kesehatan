/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pasien;

/**
 *
 * @author Hambali
 */
public class menimbang extends individu {
    private int kodeMenimbang;
    private String keterangan;
    private String tanggalMenimbang;
    private int bbTotal;
    private int kodeTimbangan;

    
    public menimbang(int kodeIndividu, String namaLengkap, String tglLahir, String namaAyah, String namaIbu, int beratBadan, int tinggiBadan, String kms, int kodeKader,
                     int kodeMenimbang, String keterangan, String tanggalMenimbang, int bbTotal, int kodeTimbangan) {
        super(kodeIndividu, namaLengkap, tglLahir, namaAyah, namaIbu, beratBadan, tinggiBadan, kms, kodeKader);
        this.kodeMenimbang = kodeMenimbang;
        this.keterangan = keterangan;
        this.tanggalMenimbang = tanggalMenimbang;
        this.bbTotal = bbTotal;
        this.kodeTimbangan = kodeTimbangan;
    }

    
    public int getKodeMenimbang() { 
        return kodeMenimbang; }
    
    public void setKodeMenimbang(int kodeMenimbang) { 
        this.kodeMenimbang = kodeMenimbang; }
    
    public String getKeterangan() { 
        return keterangan; }
    
    public void setKeterangan(String keterangan) { 
        this.keterangan = keterangan; }
    
    public String getTanggalMenimbang() { 
        return tanggalMenimbang; }
    
    public void setTanggalMenimbang(String tanggalMenimbang) { 
        this.tanggalMenimbang = tanggalMenimbang; }
    
    public int getBbTotal() { 
        return bbTotal; }
    
    public void setBbTotal(int bbTotal) { 
        this.bbTotal = bbTotal; }
    
    public int getKodeTimbangan() { 
        return kodeTimbangan; }
    
    public void setKodeTimbangan(int kodeTimbangan) { 
        this.kodeTimbangan = kodeTimbangan; }
}

