/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zakatmaal;

/**
 *
 * @author galang finto
 */

public class Donatur {
    private String nama;
    private double jumlahUang;
    private double jumlahEmas;

    public Donatur(String nama, double jumlahUang, double jumlahEmas) {
        this.nama = nama;
        this.jumlahUang = jumlahUang;
        this.jumlahEmas = jumlahEmas;
    }

    public String getNama() {
        return nama;
    }

    public double getJumlahUang() {
        return jumlahUang;
    }

    public double getJumlahEmas() {
        return jumlahEmas;
    }

    public void setJumlahUang(double jumlahUang) {
        this.jumlahUang = jumlahUang;
    }

    public void setJumlahEmas(double jumlahEmas) {
        this.jumlahEmas = jumlahEmas;
    }
}
