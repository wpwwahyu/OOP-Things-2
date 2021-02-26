/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2_pbo;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;//suatu import yang berfungsi supaya program dapat menginputkan sesuatu

public class Main {
    public static void main(String[] args){
        Scanner berat = new Scanner(System.in);
        System.out.print("Masukkan Inputan Berat dalam Kilogram\t: ");
        double weight=berat.nextDouble();
        
        Scanner bb = new Scanner(System.in);
        System.out.print("Masukkan dalam Hg : ");
        int bbb=bb.nextInt();
       
        
        hg a = new hg();
        dag b = new dag();
        g c = new g();
        cg d = new cg();
        dg e = new dg();
        mg f = new mg();
        
        a.hg(bbb);
        b.dag(bbb);
        c.g(bbb);
        d.cg(bbb);
        e.dg(bbb);
        f.mg(bbb);
    }
    
}
