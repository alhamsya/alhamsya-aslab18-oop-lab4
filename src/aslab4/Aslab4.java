/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aslab4;

import java.util.Scanner;

/**
 *
 * @author Alhamsya
 */
public class Aslab4 {
    
    private static bangun_datar rumus = new bangun_datar();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int pilih = 0;
        Scanner input;
        
        input = new Scanner(System.in);
        do{
            int n2 = 2;
            
            getData();
            pilih = input.nextInt();
            
            
            
            switch (pilih){
                case 1:
                    persegi();
                    break;
                case 2:
//                    persegi_panjang();
                    break;
                case 3:
//                    segita();
                    break;
                default:
                    System.out.println("\n Terimkasih\n");
                    break;
                    
                    
            }
        }while (pilih >= 3);
        
        
        
    }
    
    public static void getData(){
        System.out.println("-----------------------");
        System.out.println("----- Hitung Luas -----");
        System.out.println("-----------------------");
        System.out.println("1.\tPersegi");
        System.out.println("2.\tPersegi Panjang");
        System.out.println("3.\tSegitiga\n");
        System.out.print("Masukan pilihan anda ? ");
    }
    
    public static void persegi(){
       int pilih;
       Scanner input = new Scanner(System.in);
       
       int s;
       
        System.out.println("-----------------------");
        System.out.println("------- Persegi -------");
        System.out.println("-----------------------");
        System.out.print("Masukan sisi persegi ?");
        s = input.nextInt();
        rumus.setLuasPersegi(s);
        System.out.println("Hasilnya adalah : " + rumus.getLuasPersegi());
        
    }
    
}
