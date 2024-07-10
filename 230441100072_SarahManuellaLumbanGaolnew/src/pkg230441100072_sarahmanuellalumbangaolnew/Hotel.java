/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg230441100072_sarahmanuellalumbangaolnew;

/**
 *
 * @author USER
 */
public class Hotel {

    /**
     * @param args the command line arguments
     */
//membuat variabel tipe,harga,dan nama dengan tipe data String untuk tipe,integer untuk harga dan String untuk nama oengguna
    String tipe;
    int harga;
    String nama;
//menginialisasi serta mengatur masing masing atribut  
    public void setTipe(String tipe){
        this.tipe=tipe;
}
    public void setHarga(int harga){
        this.harga=harga;
}
    public void setNama(String nama){
        this.nama=nama;
    } 
//Merthod ger untuk menerima inputan dari si user 
    public static String getNama(String nama){
        return nama;
    }
    public int getHarga(String Harga){
        return harga;
    }
    public String getTipe(String tipe){
        return tipe;
    }
    public int SewaKamar(){
      return 0;
      
    }
        
    } 


