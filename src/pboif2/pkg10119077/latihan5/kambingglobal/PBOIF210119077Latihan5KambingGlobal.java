/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan5.kambingglobal;

/**
 *
 * @author RAF
 * Nama         : Ridhwan Anwar Fauzan
 * Kelas        : IF-2 
 * NIM          : 10119077
 * Deskripsi    : Kambing Global
 */
public class PBOIF210119077Latihan5KambingGlobal {

    /**
     * @param args the command line arguments
     */
    //variabel jumlahkambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing : " + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah : " + jumlahKambing);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PBOIF210119077Latihan5KambingGlobal kambingSusu = new PBOIF210119077Latihan5KambingGlobal();
        
        //Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
