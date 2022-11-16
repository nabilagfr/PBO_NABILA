/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_Nabila16112022;

/**
 *
 * @author User
 */

public class Gaji_2101092011 {
        public static void main(String[] args){
        Gaji pegawai1=new Gaji();
        
        pegawai1.setKode("211");
        pegawai1.setTgl("18 November 2022");
        pegawai1.setNama("Budi");
        pegawai1.setGol(1);
        pegawai1.setTunjanganAnak(1000000);
        pegawai1.setTunjanganIstri(2000000);
        
        System.out.println("Kode Slip : "+pegawai1.getKode());
        System.out.println("Tanggal : "+pegawai1.getTgl());
        System.out.println("Nama : "+pegawai1.getNama());
        System.out.println("Golongan : "+pegawai1.getGol());
        System.out.println("Gaji Pokok : "+pegawai1.getGaji());
        System.out.println("Tunjangan Anak : "+pegawai1.getTunjanganAnak());
        System.out.println("Tunjangan Istri : "+pegawai1.getTunjanganIstri());
        System.out.println("Total Gaji : "+pegawai1.getTotal());
        
        Gaji pegawai2=new Gaji();
        //isi object
        
        pegawai2.setKode("212");
        pegawai2.setTgl("16 November 2022");
        pegawai2.setNama("Nabila Gafernanda");
        pegawai2.setGol(2);
        pegawai2.setTunjanganAnak(2000000);
        pegawai2.setTunjanganIstri(4000000);
        
        System.out.print("\n");
        System.out.println("Kode Slip : "+pegawai2.getKode());
        System.out.println("Tanggal : "+pegawai2.getTgl());
        System.out.println("Nama : "+pegawai2.getNama());
        System.out.println("Golongan : "+pegawai2.getGol());
        System.out.println("Gaji Pokok : "+pegawai2.getGaji());
        System.out.println("Tunjangan Anak : "+pegawai2.getTunjanganAnak());
        System.out.println("Tunjangan Istri : "+pegawai2.getTunjanganIstri());
        System.out.println("Total Gaji : "+pegawai2.getTotal());
        
    }
}
