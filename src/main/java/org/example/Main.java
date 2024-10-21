package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle giriniz: ");
        String cumle = scanner.nextLine();

        int aSayisi = 0;
        int buyukHarfSayisi = 0;

        for (int i = 0; i < cumle.length(); i++) {
            char karakter = cumle.charAt(i);

            if (karakter == 'a') {
                aSayisi++;
            }

            // Büyük harf kontrolü
            if (Character.isUpperCase(karakter)) {
                buyukHarfSayisi++;
            }
        }

        System.out.println("'a' karakteri sayısı: " + aSayisi);
        System.out.println("Büyük harfli karakter sayısı: " + buyukHarfSayisi);
    }
}
