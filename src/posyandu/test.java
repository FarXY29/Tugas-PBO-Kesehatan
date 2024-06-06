/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posyandu;

import Pasien.*;
import CRUD.database;
/**
 *
 * @author Hambali
 */
public class test {
    public static void main(String[] args) {
        database dbconnect = new database();
                // Tabel UJI
        //dbconnect.simpanuji("1", "Hambali", "085151515151", "Handil Bakti");
        //dbconnect.ubahuji("1", "Hambali", "0851", "Keruing");
        //dbconnect.hapusuji("1");
        
                // Tabel KMS
        //dbconnect.simpankms("1", "keterangan", "1");
        //dbconnect.ubahkms("1", "lorem ipsum", "1");
        //dbconnect.hapuskms("1");
        //dbconnect.carikms("1");
        //dbconnect.datakms();
                // Tabel Gizi
        //dbconnect.simpangizi("1", "gizi", "1", "1");
        //dbconnect.ubahgizi("1", "Contoh", "1", "1");
        //dbconnect.hapusgizi("1");
        //dbconnect.carigizi("1");
        //dbconnect.datagizi();
        
                // Tabel Kader
        //dbconnect.simpankader("1", "gizi");
        //dbconnect.ubahkader("1", "kader");
        //dbconnect.hapuskader("1");
        //dbconnect.carikader("1");
        //dbconnect.datakader();
        
                // Tabel Individu
        //dbconnect.simpanindividu("1", "Muhammad Hambali", "2003-11-29", "nama_ayah", "nama_ibu", "82", "172", "kms", "1");
        //dbconnect.ubahindividu("1", "Muhammad Hambali", "2003-11-29", "ayah", "ibu", "82", "172", "kms", "1");
        //dbconnect.hapusindividu("1");
        //dbconnect.cariindividu("1");
        dbconnect.dataindividu();
        
//        individu individu = new individu(1, "John Doe", "1990-01-02", "Ayah", "Ibu", 75, 170, "KMS123", 101);
//
//        
//        menimbang menimbang = new menimbang(1, "John Doe", "1990-01-02", "Ayah", "Ibu", 75, 170, "KMS123", 101, 
//                                            201, "Sehat", "2024-01-02", 75, 301);
//
//        
//        System.out.println("Detail Individu:");
//        System.out.println("Kode Individu: " + individu.getKodeIndividu());
//        System.out.println("Nama: " + individu.getNamaLengkap());
//        System.out.println("Tgl Lahir: " + individu.getTglLahir());
//        System.out.println("Nama Ayah: " + individu.getNamaAyah());
//        System.out.println("Nama Ibu: " + individu.getNamaIbu());
//        System.out.println("Berat Badan: " + individu.getBeratBadan());
//        System.out.println("Tinggi Badan: " + individu.getTinggiBadan());
//        System.out.println("KMS: " + individu.getKms());
//        System.out.println("Nama Kader: " + individu.getKodeKader());
//        
//        System.out.println("\nDetail Timbangan");
//        System.out.println("Kode Menimbang: " + menimbang.getKodeMenimbang());
//        System.out.println("Keterangan: " + menimbang.getKeterangan());
//        System.out.println("Tanggal Menimbang: " + menimbang.getTanggalMenimbang());
//        System.out.println("Kode Individu: " + individu.getKodeIndividu());
//        System.out.println("BB Total: " + menimbang.getBbTotal());
//        System.out.println("Kode Timbangan: " + menimbang.getKodeTimbangan());
    }  
    
}




