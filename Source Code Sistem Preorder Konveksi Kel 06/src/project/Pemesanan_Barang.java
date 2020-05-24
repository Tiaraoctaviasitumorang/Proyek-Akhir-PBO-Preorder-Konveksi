/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Rifka
 */
public class Pemesanan_Barang {
    private String Id_pesanan;
    private String Id_pembeli;
    private int Jumlah_data;
    
    public void Tambah_data(int Jumlah_data){
       Id_pesanan+=Jumlah_data;
    }
    public void Hapus_data(){
        Id_pesanan = null;
    }
    public String Simpan_data(){
        return ("Ini data pesanan "+Jumlah_data);
    }
}

