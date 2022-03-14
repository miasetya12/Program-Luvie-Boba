package com.company.boba;
import java.util.*;

public class Dalgona {
    public static void isi() {
        Set<String> dalseries = new LinkedHashSet<>();
        dalseries.add("Brown Sugar Dalgona Boba (23k)"); // method add() untuk menambahkan objek ke Se
        dalseries.add("Salted Caramel Dalgona Boba (27k)");
        dalseries.add("Signature Dalgona Boba (24k)");

        System.out.println("\n==Menu Dalgona Series==");
        for (String planet : dalseries) {
            System.out.println(" " + planet);
        }
        System.out.print("Silahkan Masukan Pilihan Anda: ");
    }
}


