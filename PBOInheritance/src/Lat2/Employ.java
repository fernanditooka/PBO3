/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat2;

/**
 *
 * @author USER
 */
class Employ extends Person {
    private String noKaryawan;

    //Konnstruktor

    public Employ(String noKaryawan, String nama, int usia) {
        super(nama, usia);
        this.noKaryawan = noKaryawan;
    }

    //Metode

    public void informasi() {
        System.out.println("No. Karyawan: " + this.noKaryawan);
        super.informasi();
    }
}
