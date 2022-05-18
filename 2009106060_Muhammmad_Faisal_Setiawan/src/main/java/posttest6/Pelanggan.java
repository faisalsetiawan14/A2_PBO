/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

/**
 *
 * @author ACER
 */
public class Pelanggan {
    private Jaminan jaminan;
    public Pelanggan(Jaminan jaminan) {
 this.jaminan = jaminan ;   
}
    void jaminanktp(){
        this.jaminan.ktp();
    }
    void jaminanuang(){
        this.jaminan.uang();
    }

    }