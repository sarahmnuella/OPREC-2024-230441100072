/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg230441100072_sarahmanuellalumbangaoloprec;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class HotelBooking {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        boolean continueBooking = true;
        
        while(continueBooking){
            System.out.print("Masukkan nama penyewa: ");
            String namaPenyewa=input.nextLine();
            
            System.out.print("Masukkan usia penyewa: ");
            int usia = input.nextInt();
            input.nextLine();
            
            if (usia<19){
                System.out.println("Maaf Anda Belum Cukup Umur Untuk Memesan Kamar.");
                break;
             
            }
            System.out.print("Tipe Kamar: ");
            System.out.println("1.Reguler = Rp.100.000");
            System.out.println("2.Double Reguler = Rp.200.000");
            System.out.println("3.Premium = Rp.250.000");
            System.out.println("4.Deluxe = Rp.350.000");
            System.out.println("5.Super Premium = Rp.500.000");
            
            
            System.out.print("Pilih tipe kamar(1-5): ");
            int pilihan = input.nextInt();
            input.nextLine();
            
            
            Hotel kamar=null;
            
            switch (pilihan){
                case 1:
                    kamar = new Reguler(namaPenyewa);
                    break;
                case 2:
                    kamar = new DoubleReguler(namaPenyewa);
                    break;
                case 3:
                    kamar= new Premium(namaPenyewa);
                    break;
                case 4:
                    kamar=new Deluxe(namaPenyewa);
                    break;
                case 5:
                    kamar=new SuperPremium(namaPenyewa);
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid");
                    continue;
            }
            System.out.print("Berapa malam Anda akan menginap? : ");
            int jumlahMalam=input.nextInt();
            double totalHarga=kamar.getHargaKamar()*jumlahMalam;
            
            if (totalHarga>700000){
                totalHarga*=0.95;
            }else if (totalHarga>500000){
                totalHarga *=0.97;
            }
            
            
            System.out.printf("Total harga untuk %d malam di kamar %s adalah: Rp. %.2f%n", jumlahMalam, kamar.getTipeKamar(), totalHarga);

            kamar.infoKamar();

            System.out.print("Apakah Anda ingin memesan lagi? (y/n): ");
            String lagi = input.nextLine();
            if (!lagi.equalsIgnoreCase("y")) {
                continueBooking = false;
            }
        }
        input.close();
    } 
}
