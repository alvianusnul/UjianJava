/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.text.*;
/**
 *
 * @author alvianusnul
 */
public class UjianNo3 {
    public static void main(String args[]) {

      Date HariSekarang = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E yyyy-MM-dd 'pada' hh:mm:ss:SSS a zzz");

      System.out.println("Tanggal dan waktu saat ini: " + ft.format(HariSekarang));
   }
}
