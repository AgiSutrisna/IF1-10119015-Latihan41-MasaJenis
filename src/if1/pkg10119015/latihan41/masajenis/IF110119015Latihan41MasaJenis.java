/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan41.masajenis;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class IF110119015Latihan41MasaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Kubus kubus = new Kubus();
        
        kubus.setSisi(5);
        kubus.setMassa(250);
        
        int sisi = kubus.getSisi();
        int massa = kubus.getMassa();
        int volume = kubus.hitungVolume(sisi);
        
        System.out.println("=====Massa Jenis Kubus=====");
        System.out.println("Sisi : " + sisi);
        System.out.println("Massa : " + massa);
        System.out.println();
        System.out.println("======Hasil perhitungan=====");
        System.out.println("Volume : " + volume);
        System.out.println("Massa Jenis : " + kubus.hitungMassaJenis(massa, volume));
    }
    
}
