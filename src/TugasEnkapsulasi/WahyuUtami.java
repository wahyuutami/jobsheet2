/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasEnkapsulasi;

/**
 *
 * @author WINDOWS 10
 */
public class WahyuUtami {
   public static void main(String args[]){
       EncapWahyu wahyu = new EncapWahyu();
       wahyu.setnamaAyah("Trisno");
       wahyu.setnamaIbu("Sudarningrat");
       wahyu.setnamaSendiri("Wahyu Utami Ningtris");
       wahyu.setnamaSaudara("Wahyu Kurnia Ningtris");
       wahyu.setAlamat("Malang");
       wahyu.setHobi("Membaca");
       wahyu.setCitacita("Guru");
       wahyu.setUmur(16);
       
       System.out.println("Nama Ayah : " + wahyu.getnamaAyah() +
               "\nNama Ibu : " + wahyu.getnamaIbu() + 
               "\nNama Sendiri : " + wahyu.getnamaSendiri() +
               "\nNama Saudara : " + wahyu.getnamaSaudara() +
               "\nAlamat : " + wahyu.getAlamat() +
               "\nHobi : " + wahyu.getHobi() +
               "\nCita-cita : " + wahyu.getCitacita() +
               "\nUmur : " + wahyu.getUmur()
    );
   }
}
