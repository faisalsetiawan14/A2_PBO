/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest6;
/**
 *
 * @author ACER
 */

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class main {
    static Jaminan info = new Info();
    static Pelanggan Budi = new Pelanggan (info);
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<mobil> Mobil = new ArrayList<>();
    static ArrayList<Matic> matic = new ArrayList<>();
    static ArrayList<Manual> manual = new ArrayList<>();
    static int harga, index;
    static String nama_penyewa, merk_mobil;
    public static void main(String[] args) throws IOException { 
        while(true){
             menu();
             Budi.jaminanktp();
    }
    
    }
     static void informasi() throws IOException{
     Budi.jaminanktp();
     }
    
    
    
    static void order() throws IOException{
         //merk
            String nama;
            int harga;
            int pilihan;
            
            
        
            
    System.out.println("1. Matic");
    System.out.println("2. Manual");
    System.out.println("Masukan pilihan : ");
    pilihan = Integer.parseInt(input.readLine());
    if (pilihan == 1) {
        System.out.println("Masukan nama penyewa : ");
        nama_penyewa = input.readLine();
        System.out.println("Masukan merk mobil : ");
        String merk_mobil = input.readLine();
        System.out.println("Masukan harga : ");
        harga = Integer.parseInt(input.readLine());
        System.out.println("Masukan Ukuran Mobil : ");
        String ukuran_mobil = input.readLine();
        System.out.println("Masukan Tujuan : ");
        String tujuan = input.readLine();
        matic.add(new Matic(nama_penyewa, merk_mobil, harga, ukuran_mobil, tujuan));
        } else {
        if (pilihan == 2) {
        System.out.println("Masukan nama penyewa : ");
        nama_penyewa = input.readLine();
        System.out.println("Masukan merk mobil : ");
        String merk_mobil = input.readLine();
        System.out.println("Masukan harga : ");
        harga = Integer.parseInt(input.readLine());
        System.out.println("Masukan Ukuran Mobil : ");
        String ukuran_mobil = input.readLine();
        System.out.println("Masukan Tujuan : ");
        String tujuan = input.readLine();
        manual.add(new Manual(nama_penyewa, merk_mobil, harga, ukuran_mobil, tujuan));
        }

}           
}

     //menampilkan pesanan
    static void lihat() throws IOException{
int pilihan;
    System.out.println("1. Mobil Matic");
    System.out.println("2. Mobil Manual");
    System.out.println("Masukan pilihan : ");
    pilihan = Integer.parseInt(input.readLine());
    if (pilihan == 1) {
                        for (int i = 0; i < matic.size(); i++) {
                            System.out.println("Mobil Matic ke - " + (i + 1));
                            matic.get(i).display();
                        }
                    } else {
                        for (int i = 0; i < manual.size(); i++) {
                            System.out.println("Mobil manual ke - " + (i + 1));
                            manual.get(i).display();
                        }
                    }

            }
    
    static void ubah() throws IOException{
    int pilihan;
    String nama;
    lihat();
    System.out.println("1. Mobil Matic");
    System.out.println("2. Mobil Manual");
    System.out.println("Masukan pilihan : ");
    pilihan = Integer.parseInt(input.readLine());
    System.out.println("Ubah Data Penyewa");
    if (pilihan == 1) {
                        System.out.println("Masukan nama penyewa : ");
                        nama = input.readLine();
                        for (Matic i : matic) {
                            if (i.getNama_penyewa().equals(nama)) {
                                System.out.println("Masukan Nama Penyewa baru : ");
                                i.setNama_penyewa(input.readLine());
                                System.out.println("Masukan Merk Mobil baru : ");
                                i.setMerk_mobil(input.readLine());
                                System.out.println("Masukan harga baru : ");
                                i.setHarga(Integer.parseInt(input.readLine()));
                                System.out.println("Masukan ukuran mobil baru : ");
                                i.setUkuran_mobil(input.readLine());
                                System.out.println("Masukan tujuan baru : ");
                                i.setTujuan(input.readLine());
                            }
                        }
                    } else {
                        System.out.println("Masukan nama penyewa : ");
                        nama = input.readLine();
                        for (Manual i : manual) {
                            if (i.getNama_penyewa().equals(nama)) {
                                System.out.println("Masukan Nama Penyewa baru : ");
                                i.setNama_penyewa(input.readLine());
                                System.out.println("Masukan Merk Mobil baru : ");
                                i.setMerk_mobil(input.readLine());
                                System.out.println("Masukan harga baru : ");
                                i.setHarga(Integer.parseInt(input.readLine()));
                                System.out.println("Masukan ukuran mobil baru : ");
                                i.setUkuran_mobil(input.readLine());
                                System.out.println("Masukan tujuan baru : ");
                                i.setTujuan(input.readLine());
                            }
                        }
                    }
}
    
        //menghapus pesanan
    static void delete() throws IOException{
    lihat();
    int pilihan;
    int t;
    System.out.println("1. Mobil Matic");
    System.out.println("2. Mobil Manual");
    System.out.println("Masukan pilihan : ");
    pilihan = Integer.parseInt(input.readLine());
    if (pilihan == 1) {
        System.out.println("input Slot index = ");
        t = Integer.parseInt(input.readLine());
        t--;
        matic.remove(t);
    } else {
    System.out.println("input Slot index = ");
    t = Integer.parseInt(input.readLine());
    t--;

    manual.remove(t);

    }
}
       //menu utama
    static void menu() throws IOException{
        
        System.out.println("|    CV Faisal Transportation     |");
        System.out.println("|  Menu :                         |");
        System.out.println("|  1. Aktivasi jaminan            |");
        System.out.println("|  2. Pesan mobil                 |");
        System.out.println("|  3. Lihat pesanan               |");
        System.out.println("|  4. Ubah pesan                  |");
        System.out.println("|  5. Hapus pesan                 |");
        System.out.println("|  6. Keluar                      |");
        System.out.println(" Masukkan Pilihan [1-6] : ");
        int pilihan = Integer.parseInt(input.readLine());
        switch (pilihan){
            case 1 -> {
                informasi();
            }
            
            case 2 -> {
                order();
            }
            case 3 -> {
                    lihat();
                }
                
            case 4 -> {
                ubah();
                      
                }
            case 5 -> {
                delete();
                
            }
            case 6 -> {
                System.out.println("|         Thank You        |");
            }
            default -> {
                System.out.println("|         Masukkan Salah         |");
                      
                    }
        }
    }
}

