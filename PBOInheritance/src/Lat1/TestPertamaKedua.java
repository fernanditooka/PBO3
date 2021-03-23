/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat1;

/**
 *
 * @author USER
 */
class TestPertamaKedua extends Pertama {
    public static void main (String[]args){
        Kedua D2 = new Kedua();
        D2.BacaSuper();
        D2.informasi();
        
        Pertama S1 = new Pertama();
        S1.terproteksi();
        S1.informasi();
    }
}
