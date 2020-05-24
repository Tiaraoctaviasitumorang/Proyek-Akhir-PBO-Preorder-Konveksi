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
public class Barang {
    private String Id_barang;
    private String Nama_barang;
    private int Harga_barang;
    private int Jumlah_barang;
    
    public void Tambah_barang(int Jumlah_barang){
        Id_barang+=Jumlah_barang;
    }
    public void Hapus_barang(){
     Id_barang = null;
    }
     public String Simpan_barang(){
        return ("Ini data barang "+Jumlah_barang);
    }
}
