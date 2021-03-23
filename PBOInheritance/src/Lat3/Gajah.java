/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat3;

/**
 *
 * @author USER
 */
public class Gajah extends Hewan {
    public static void testClassMethod(){
        System.out.println("The Class Method in Gajah...");
    } 
    public void testInstanceMethod(){
        System.out.println("The Instance Method in Gajah...");
    }
    public static void main(String[]args){
        Gajah mygajah = new Gajah();
        Hewan myhewan = new Gajah();
        Hewan.testClassMethod();
        myhewan.testInstanceMethod();
    }
}
