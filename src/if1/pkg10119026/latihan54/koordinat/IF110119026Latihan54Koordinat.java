/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan54.koordinat;

/**
 *
 * @author Asus
 * NAMA         : Muhammad Khatami
 * KELAS        : IF-1
 * NIM          : 10119026
 * Deskripsi Program : program ini untuk menampilkan koordinat
 */
public class IF110119026Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat warna = new WarnaKoordinat(10,4, "Jingga");
        System.out.println("Warna Koordinat : "+warna.getNamaWarna());
        System.out.println("Koordinat sumbu x : "+warna.getX()+" y : "+warna.getY());
    }
    
}
