package com.company.pembelian;
import java.util.Scanner;

public class Beli {
    public static void isi1() {
        int harga, jumlah, pilihan;

        Scanner aa = new Scanner(System.in);

        System.out.println("================================");
        System.out.print("Masukan Pilihan Anda: ");
        pilihan = aa.nextInt();
        System.out.print("Masukan Jumlah Barang: ");
        jumlah = aa.nextInt();


        if (pilihan == 1 || pilihan == 2) {
            harga = 23000 * jumlah;
        } else {
            harga = 28000 * jumlah;
        }

        System.out.println("Total harga barang : " + harga);
    }

    public static void isi2() {
        int harga, jumlah, pilihan;

        Scanner aa = new Scanner(System.in);

        System.out.println("================================");
        System.out.print("Masukan Pilihan Anda: ");
        pilihan = aa.nextInt();
        System.out.print("Masukan Jumlah Barang: ");
        jumlah = aa.nextInt();


        if (pilihan == 1) {
            harga = 23000 * jumlah;
        } else if (pilihan == 2) {
            harga = 27000 * jumlah;
        } else {
            harga = 24000 * jumlah;
        }

        System.out.println("Total harga barang : " + harga);
    }

    public static void isi3() {
        int harga, jumlah, pilihan;

        Scanner aa = new Scanner(System.in);

        System.out.println("================================");
        System.out.print("Masukan Pilihan Anda: ");
        pilihan = aa.nextInt();
        System.out.print("Masukan Jumlah Barang: ");
        jumlah = aa.nextInt();


        if (pilihan == 1) {
            harga = 29000 * jumlah;
        } else {
            harga = 30000 * jumlah;
        }

        System.out.println("Total harga barang : " + harga);
    }
}
