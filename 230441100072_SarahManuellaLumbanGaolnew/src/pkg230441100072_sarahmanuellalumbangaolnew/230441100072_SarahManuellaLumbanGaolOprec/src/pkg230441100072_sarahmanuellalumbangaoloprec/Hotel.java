/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg230441100072_sarahmanuellalumbangaoloprec;

/**
 *
 * @author USER
 */
public class Hotel {
    protected String tipeKamar;
    protected double hargaKamar;
    protected String namaPenyewa;
  
    public Hotel(String namaPenyewa){
        this.namaPenyewa=namaPenyewa;
    }
    public String getTipeKamar(){
        return tipeKamar;
    }
    public double getHargaKamar(){
        return hargaKamar;
    }
    
    public void infoKamar(){
        System.out.println("Tipe kamar: "+tipeKamar);
        System.out.println("Harga per Malam: Rp. "+ hargaKamar);
    }
}