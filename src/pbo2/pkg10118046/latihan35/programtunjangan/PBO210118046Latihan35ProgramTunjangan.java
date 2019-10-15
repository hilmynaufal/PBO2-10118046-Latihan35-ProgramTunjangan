/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118046.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : membuat program tunjangan gaji dengan konsep pbo
 */
public class PBO210118046Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tunjangan tunjangan = new Tunjangan();
        
        System.out.println("=========Program Tunjangan=========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        Scanner scanner = new Scanner(System.in);
        tunjangan.setGaji(scanner.nextDouble());
        System.out.print("Status anda? (Menikah/Belum)\t: ");
        tunjangan.setStatus(scanner.next());
        tunjangan.tampilGaji();
        
    }

}
