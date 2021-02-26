/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2_pbo;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Modul2_PBO {
    public static void main (String[] args) {
        double kg, hg, dag, g, cg, dg, mg;
        Scanner berat = new Scanner(System.in);
        System.out.print("Masukkan Berat dalam Kilogram\t: ");
        kg=berat.nextDouble();
        
        hg = kg*10;
        dag = kg*100;
        g = kg*1000;
        cg = kg*10000;
        dg = kg*100000;
        mg = kg*1000000;
       
        System.out.println("Konversi ke hg\t:"+hg);
        System.out.println("Konversi ke dag\t:"+dag);
        System.out.println("Konversi ke g\t:"+g);
        System.out.println("Konversi ke cg\t:"+cg);
        System.out.println("Konversi ke dg\t:"+dg);
        System.out.println("Konversi ke mg\t:"+mg);
    }
}
