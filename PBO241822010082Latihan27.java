/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo2.pkg41822010082.latihan27;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Caca
 * Nama : Adjeng Rara Rengganis
 * NIM  : 41822010079
 * Nama : Vanisha Putri Kania 
 * NIM  : 41822010082
 * 
 */
public class PBO241822010082Latihan27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("FORMAT TUGAS PBO");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();

        // Mengonversi ke huruf besar
        String hurufBesar = kalimat.toUpperCase();

        // Mengonversi ke huruf kecil
        String hurufKecil = kalimat.toLowerCase();

        // Menampilkan hasil
        System.out.println("Huruf Besar: " + hurufBesar);
        System.out.println("Huruf Kecil: " + hurufKecil);    // TODO code application logic here
    }
    
}
