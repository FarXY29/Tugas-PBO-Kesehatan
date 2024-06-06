/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pasien;

/**
 *
 * @author Hambali
 */
public class individu {
    private int kodeIndividu;
    private String namaLengkap;
    private String tglLahir;
    private String namaAyah;
    private String namaIbu;
    private int beratBadan;
    private int tinggiBadan;
    private String kms;
    private int kodeKader;

    
    public individu(int kodeIndividu, String namaLengkap, String tglLahir, String namaAyah, String namaIbu, int beratBadan, int tinggiBadan, String kms, int kodeKader) {
        this.kodeIndividu = kodeIndividu;
        this.namaLengkap = namaLengkap;
        this.tglLahir = tglLahir;
        this.namaAyah = namaAyah;
        this.namaIbu = namaIbu;
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
        this.kms = kms;
        this.kodeKader = kodeKader;
    }

   
    public int getKodeIndividu() { return kodeIndividu; }
    public void setKodeIndividu(int kodeIndividu) { this.kodeIndividu = kodeIndividu; }
    public String getNamaLengkap() { return namaLengkap; }
    public void setNamaLengkap(String namaLengkap) { this.namaLengkap = namaLengkap; }
    public String getTglLahir() { return tglLahir; }
    public void setTglLahir(String tglLahir) { this.tglLahir = tglLahir; }
    public String getNamaAyah() { return namaAyah; }
    public void setNamaAyah(String namaAyah) { this.namaAyah = namaAyah; }
    public String getNamaIbu() { return namaIbu; }
    public void setNamaIbu(String namaIbu) { this.namaIbu = namaIbu; }
    public int getBeratBadan() { return beratBadan; }
    public void setBeratBadan(int beratBadan) { this.beratBadan = beratBadan; }
    public int getTinggiBadan() { return tinggiBadan; }
    public void setTinggiBadan(int tinggiBadan) { this.tinggiBadan = tinggiBadan; }
    public String getKms() { return kms; }
    public void setKms(String kms) { this.kms = kms; }
    public int getKodeKader() { return kodeKader; }
    public void setKodeKader(int kodeKader) { this.kodeKader = kodeKader; }
}

