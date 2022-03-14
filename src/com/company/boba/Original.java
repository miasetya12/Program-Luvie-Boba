package com.company.boba;
import java.util.*;
import com.company.pembelian.Beli;

public class Original {
    public static void isi() {
        List<String> boba = new ArrayList<>();
        boba.add("1 Brown Sugar Boba Fresh Milk (23k)");
        boba.add("2 Brown Sugar Boba Milk Tea (23k)");
        boba.add("3 Salted Caramel Boba Fresh Milk (28k)");

        System.out.println("\n==Menu D'Boba==");
            // method size() untuk mendapatkan ukuran List
        for (String s : boba) {
            System.out.println("" + s);
        }


    }
}
