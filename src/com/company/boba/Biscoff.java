package com.company.boba;
import java.util.*;

public class Biscoff {
    public static void isi () {
        Map<Integer, String> biseries = new LinkedHashMap<>();
        biseries.put(1,"Signature Biscoff Dalgona (29k)");// method put() untuk menambahkan objek ke Map
        biseries.put(2, "Dirty Biscoff Dalgona (30k)");
        biseries.put(3, "Salted Caramel Biscoff (30k)");
        System.out.println("\n==Menu Biscoff Series==");
        biseries.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
