/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum1;

/**
 *
 * @author WINDOWS 10
 */
public class Ujibus {
    public static void main(String[] args) {
        Bus ujibus = new Bus(40);
        ujibus.addpenumpang(17);
        ujibus.getpenumpang(24);
        ujibus.cetakpenumpang();
        
        ujibus.addpenumpang(2);
        ujibus.cetakpenumpang();
        
        ujibus.addpenumpang(1);
        ujibus.cetakpenumpang();
        
        ujibus.addpenumpang(2);
        ujibus.cetakpenumpang();
        
        ujibus.addpenumpang(2);
        ujibus.cetakpenumpang();
        
        System.out.println("Rata-rata Penumpang : "+ujibus.getAverage());
    } }
