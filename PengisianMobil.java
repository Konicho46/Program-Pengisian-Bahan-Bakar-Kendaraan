//C14210301_Nicholas Nathanael Suhendar
package com.pbo.praktikum1;

class Kendaraan{
    String namaMobil;
    String merkMobil;
    int tahun;
    int isiBensin;
    int isiTangki;
    int kapasitasTangki;

    //Mencetak informasi
    void cetakInfo(){
        System.out.println("Nama: " + namaMobil);
        System.out.println("Merk: " +merkMobil);
        System.out.println("Tahun: " +tahun);
        System.out.println("Kapasitas Tangki: " + kapasitasTangki);
        System.out.println("Isi tangki saat ini: " + isiTangki);
        System.out.println("Isi tangki: " +isiBensin+ " liter");

    }
    void isiBensin(){
        isiTangki = isiTangki + isiBensin;

        if (kapasitasTangki >= isiTangki){
            System.out.println(namaMobil + " diisi bensin sebanyak " + isiBensin + " liter");
        }
        else{
            kapasitasTangki = kapasitasTangki - isiBensin;
            System.out.println(namaMobil + " hanya bisa diisi bensin sebanyak " + kapasitasTangki + " liter");
        }
    }
}

public class PengisianMobil {
    public static void main(String[] args) {
        Kendaraan mobil_1 = new Kendaraan();
        mobil_1.namaMobil = "Mobil Bapak";
        mobil_1.merkMobil = "Honda";
        mobil_1.tahun = 2010;
        mobil_1.kapasitasTangki = 30;
        mobil_1.isiTangki = 20;
        mobil_1.isiBensin = 20;

        mobil_1.cetakInfo();
        System.out.println();
        mobil_1.isiBensin();
        System.out.println();

        System.out.println("==================");

        Kendaraan mobil_2 = new Kendaraan();
        mobil_2.namaMobil = "Panther";
        mobil_2.merkMobil = "Isuzu";
        mobil_2.tahun = 2005;
        mobil_2.kapasitasTangki = 30;
        mobil_2.isiTangki = 20;
        mobil_2.isiBensin = 10;

        System.out.println();
        mobil_2.cetakInfo();
        System.out.println();
        mobil_2.isiBensin();
    }
}
