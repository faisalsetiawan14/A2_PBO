/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

/**
 *
 * @author ACER
 */
public class Info implements Jaminan{
private boolean isDatadiri;
public void ktp(){
    isDatadiri = true;
    System.out.println("jaminan ktp");
    System.out.println("Silahkan lanjutakan pesanan");
}
    public void uang(){
        isDatadiri = false;
        System.out.println("tidak menggunakan ktp");
    }
}
