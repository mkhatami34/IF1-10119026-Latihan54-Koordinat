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
public class Koordinat {
    protected int x;
    protected int y;
    
    public Koordinat(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    
    public void setX(){
        this.x = x;
    }
    
     public int getY(){
        return y;
    }

    public void setY(){
        this.y = y;
    }
    
}
