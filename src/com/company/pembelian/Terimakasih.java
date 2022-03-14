package com.company.pembelian;
import com.company.Main;
import java.util.*;

public class Terimakasih {
    public static void ucapan() {
        char pilihan;
        Scanner aa = new Scanner(System.in);
        System.out.println("\n================================");
        System.out.println("Mohon ditunggu, pesanan segera datang!");
        System.out.println("Ingin memesan kembali? (y/n) :  ");
        pilihan = (char) aa.nextInt();
        if (pilihan == 'Y' || pilihan == 'y') {
            Main.main();
        }
    }
}
