/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat4;

/**
 *
 * @author USER
 */
class DemoOverride2 {
    public static void main(String[] args) {
        B objek = new B();
        objek.setA(50);
        objek.setB(150);
        //akan memanggil method yang terdapat pada kelas B
        objek.tampilkanNilai();
    }
}
