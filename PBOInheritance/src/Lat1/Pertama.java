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
class Pertama {
    private int a =10;
    protected void terproteksi(){
        System.out.println("Method ini hanya untuk anaknya");
}
    public void informasi(){
        System.out.println("a = "+a);
        System.out.println("Dipanggil pada = "+ this.getClass().getName());
    }
}