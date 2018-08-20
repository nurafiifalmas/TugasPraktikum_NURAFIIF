/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class TokoBuku {
    public static void main(String[] args) {
         String Nama  = "           Toko NURAFIIF";
         String alamat = "      Jln.H.A.Salim nomer 51c";
         String nomer = "(0351)7818364";
         Scanner scanner = new Scanner(System.in);
          String namabarang;
          System.out.print("Nama Barang    : ");
          namabarang = scanner.next();
          int harga ;
          System.out.print("Masukkan Harga : Rp");
          harga = scanner.nextInt();
           int jumlah ;
          System.out.print("Jumlah Barang  : ");
          jumlah = scanner.nextInt();
          int D;  
          D = harga * jumlah;
          System.out.println("Total harga    : Rp"+D);
          int bayar;
          System.out.print("Uang bayar     : Rp");
          bayar = scanner.nextInt();
             
          
    System.out.println("\n===================================");
    System.out.println(Nama);
    System.out.println(alamat);
    System.out.println("         Tlp : "+nomer);
    System.out.println("===================================");
    System.out.println("\nNama Barang   : " +namabarang );
    System.out.println("Harga Barang  : " +harga );
    System.out.println("Jumlah Barang : " +jumlah );
 int hargaTotal, a, kembalian;  
    System.out.println("Total harga   : Rp"+D);
      
       System.out.println("\nSetelah di Diskon");
       if(D > 500000) {
           a = D/100*50;
           hargaTotal = D - a;
           kembalian = bayar - hargaTotal;
        System.out.println("Kode Barang          : 040302");
        System.out.println("diskon 50%");
        System.out.println("Diskon               : Rp"+a);
        System.out.println("Harga setelah diskon : Rp"+hargaTotal);
        System.out.println("\nUang bayar           : Rp"+bayar);
        System.out.println("Uang kembalian       : Rp"+kembalian);
    } else if(D > 200000) {
           a = D/100*20;
           hargaTotal = D - a;
           kembalian = bayar - hargaTotal;
        System.out.println("Kode Barang          : 030204");
        System.out.println("diskon 20%");
        System.out.println("Diskon               : Rp"+a);
        System.out.println("Harga setelah diskon : Rp"+hargaTotal);
        System.out.println("\nUang bayar           : Rp"+bayar);
        System.out.println("Uang kembalian       : Rp"+kembalian);
    }  else if 
        (D > 100000) {
           a = D/100*10;
           hargaTotal = D-a;
           kembalian = bayar - hargaTotal;
        System.out.println("Kode Barang          : 020304");
        System.out.println("diskon 10%");
        System.out.println("Diskon               : Rp"+a);
        System.out.println("Harga setelah diskon : Rp"+hargaTotal);
        System.out.println("\nUang bayar           : Rp"+bayar);
        System.out.println("Uang kembalian       : Rp"+kembalian);
    }else{
          System.out.println("-");
    }
      
           System.out.println("\n===================================");
        System.out.println("Nama Kasir : Nurafiif Almas Azhari");
        System.out.println("===================================");
         System.out.println("\n ");
    
    }
}


