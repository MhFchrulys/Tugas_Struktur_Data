/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaex1;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Max_Min {
    public static void main(String[] args) {
        System.out.println("Mencari Nilai Minimum Dan Maksimum pada Index Array dengan -1 sebagai pelatuknya");
        Scanner sc = new Scanner(System.in);
        int x[] = new int[100];
        int jml = 100,stop = 0;
        for (int i=0;i<jml;i++){
            System.out.print("Masukkan Array isi " + (i+1) + " = ");
            x[i] = sc.nextInt();
                if(x[i]==-1 || x[i]==100){
                  jml = -1;
                  stop = i;   
            }
        }
        int  maks = x[0],min = x[0];
        for (int i=0;i<stop;i++){
            if (x[i]>maks){
                maks = x[i];
            }
            else if(x[i]< min) {
                min = x[i];
            }
        }
        
        System.out.println("");
        System.out.println("Nilai Maksimumnya : " + maks);
        System.out.println("Nilai Minimumnya : " + min);
    }
}
