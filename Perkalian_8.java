package javaex1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Perkalian_8 {
    public static void main(String[] args) {
        System.out.println("Tugas Struktur Data Membuat Perkalian 8 Menggunakan Looping");
        System.out.println("Dengan for");
        int hslfor = 0,hslwhile = 0,hsldo = 0,awal1 = 0,awal2 = 0;
        for (int i=1;i<11;i++){
            hslfor = i*8;
            System.out.println(i + " x 8 = " + hslfor);
        }
        System.out.println(" ");
        System.out.println("Dengan While");
        while (awal1 < 10){
            awal1 = awal1 + 1;
            hslwhile = awal1 * 8;
            System.out.println(awal1 + " x 8 = " + hslwhile);   
        }
        System.out.println(" ");
        System.out.println("Dengan Do While");
        do {
            awal2++;
            hsldo = awal2*8;
            System.out.println(awal2 + " x 8 = " + hsldo);
        }while (awal2 < 10);
        
}
}
