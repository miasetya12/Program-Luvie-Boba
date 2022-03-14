package com.company.boba;
import com.company.Main;

import java.util.*;

public class Varian {
    public static void ori() {
        Scanner aa = new Scanner(System.in);
        List<String> boba = new ArrayList<>();
        boba.add("1 Brown Sugar Boba Fresh Milk (23k)");
        boba.add("2 Brown Sugar Boba Milk Tea (23k)");
        boba.add("3 Salted Caramel Boba Fresh Milk (28k)");
        boba.add("4 ---Kembali---");
        System.out.println("\n==Menu D'Boba==");
        // method size() untuk mendapatkan ukuran List
        for (String s : boba) {
            System.out.println("" + s);
        }

        System.out.println("================================");
        System.out.print("Masukan Pilihan Anda: ");
        int pilihan = aa.nextInt();
        if (pilihan == 4) {
            Main.main();
        }
    }

    public static void biscoff() {
        Scanner aa = new Scanner(System.in);
        Map<Integer, String> biseries = new LinkedHashMap<>();
        biseries.put(1, "Signature Biscoff Dalgona (29k)");// method put() untuk menambahkan objek ke Map
        biseries.put(2, "Dirty Biscoff Dalgona (30k)");
        biseries.put(3, "Salted Caramel Biscoff (30k)");
        biseries.put(4, "---Kembali---");
        System.out.println("\n==Menu Biscoff Series==");
        biseries.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("================================");
        System.out.print("Masukan Pilihan Anda: ");
        int pilihan = aa.nextInt();
        if (pilihan == 4) {
            Main.main();
        }
    }

    public static void dalgona() {
        Scanner aa = new Scanner(System.in);
        Set<String> dalseries = new LinkedHashSet<>();
        dalseries.add("Brown Sugar Dalgona Boba (23k)"); // method add() untuk menambahkan objek ke Se
        dalseries.add("Salted Caramel Dalgona Boba (27k)");
        dalseries.add("Signature Dalgona Boba (24k)");
        dalseries.add("4 ---Kembali---");
        System.out.println("\n==Menu Dalgona Series==");
        for (String planet : dalseries) {
            System.out.println(" " + planet);
        }
        System.out.print("Silahkan Masukan Pilihan Anda: ");

        System.out.println("================================");
        System.out.print("Masukan Pilihan Anda: ");
        int pilihan = aa.nextInt();
        if (pilihan == 4) {
            Main.main();
        }
    }
}