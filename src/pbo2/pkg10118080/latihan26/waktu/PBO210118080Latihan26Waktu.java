/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan26.waktu;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 
 * Nama :Taufiq Rizky
 * NIM  :10118080
 * Deskripsi Program    : program menampilkan waktu sekarang
 */
public class PBO210118080Latihan26Waktu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date date = new Date( );
      SimpleDateFormat tgl = new SimpleDateFormat ("EEEE',' dd MMM yyyy hh:mm:ss ");

      System.out.println("Hari ini adalah hari : " + tgl.format(date));
    }
    
}
