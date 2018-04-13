/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aslab4;

/**
 *
 * @author Alhamsya
 */
public class bangun_datar {
    
    private double sisi,  panjang, lebar, alas, tinggi;
    
    public bangun_datar(){
        
    }
    
    public void setLuasPersegi(double s){
        sisi = s;
    }
    
    public void setPersegiPanjang(double p, double l){
        panjang = p;
        lebar = l;
    }
    
    public void setSegitiga(double a, double t){
        alas = a;
        tinggi = t;
    }
    
    public double getLuasPersegi(){
        double hasil;
        
        hasil = sisi*sisi;
        
        return hasil;
    }
    
    public double getPersegiPanjang(){
        double hasil;
        
        hasil = panjang * lebar;
        
        return hasil;
    }
    
    public double getSegitiga(){
        double hasil;
        
        hasil = 1/2 * (alas * tinggi);
        
        return hasil;
    }
    
}
