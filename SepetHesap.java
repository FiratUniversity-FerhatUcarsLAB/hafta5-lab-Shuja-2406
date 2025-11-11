/*
 * Ad Soyad: [Shuja Ahmad Tariq]
 * Ogrenci No: [240541608]
 * Tarih: [11-11-2025]
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

import java.util.Scanner;

import java.util.Scanner;

public class SepetFisHesaplayici {

    // --- Sabitler ---
    final static double VAT_RATE = 0.18;       // KDV oranı (%18)
    final static double SHIPPING_FEE = 29.99;  // Kargo ücreti (TL)

    // --- 1. Ürün Satış Toplamı Hesabı ---
    public static double hesaplaSatisToplami(double fiyat, int adet) {
        return fiyat * adet;
    }

    // --- 2. Ara Toplam Hesabı ---
    public static double hesaplaAraToplam(double urun1, double urun2, double urun3) {
        return urun1 + urun2 + urun3;
    }

    // --- 3. İndirim Tutarı Hesabı ---
    public static double hesaplaIndirimTutari(double araToplam, double indirimYuzdesi) {
        return araToplam * (indirimYuzdesi / 100);
    }

    // --- 4. İndirimli Toplam Hesabı ---
    public static double hesaplaIndirimliToplam(double araToplam, double indirimTutari) {
        return araToplam - indirimTutari;
    }

    // --- 5. KDV Tutarı Hesabı ---
    public static double hesaplaKdvTutari(double indirimliToplam) {
        return indirimliToplam * VAT_RATE;
    }

    // --- 6. Genel Toplam Hesabı ---
    public static double hesaplaGenelToplam(double indirimliToplam, double kdvTutari) {
        return indirimliToplam + kdvTutari + SHIPPING_FEE;
    }

    // --- Ana Metot ---
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SEPET FİŞİ HESAPLAMA ===");

        // --- Ürün Bilgileri Al ---
        double[] fiyatlar = new double[3];
        int[] adetler = new int[3];
        double[] toplamlari = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("\n" + (i + 1) + ". Ürün Fiyatı (TL): ");
            fiyatlar[i] = input.nextDouble();
            System.out.print((i + 1) + ". Ürün Adedi: ");
            adetler[i] = input.nextInt();
            toplamlari[i] = hesaplaSatisToplami(fiyatlar[i], adetler[i]);
        }

        // --- Ara Toplam ---
        double araToplam = hesaplaAraToplam(toplamlari[0], toplamlari[1], toplamlari[2]);

        // --- İndirim ---
        System.out.print("\nİndirim Oranı (%): ");
        double indirimOrani = input.nextDouble();
        double indirimTutari = hesaplaIndirimTutari(araToplam, indirimOrani);
        double indirimliToplam = hesaplaIndirimliToplam(araToplam, indirimTutari);

        // --- KDV ve Genel Toplam ---
        double kdvTutari = hesaplaKdvTutari(indirimliToplam);
        double genelToplam = hesaplaGenelToplam(indirimliToplam, kdvTutari);

        // --- Fiş Formatında Yazdır ---
        System.out.println("\n========================================");
        System.out.println("              ALIŞVERİŞ FİŞİ");
        System.out.println("========================================");
        System.out.printf("%-10s %10s %10s %10s\n", "Ürün", "Fiyat", "Adet", "Toplam");
        System.out.println("----------------------------------------");

        for (int i = 0; i < 3; i++) {
            System.out.printf("%-10s %10.2f %10d %10.2f\n",
                    ("Ürün " + (i + 1)), fiyatlar[i], adetler[i], toplamlari[i]);
        }

        System.out.println("----------------------------------------");
        System.out.printf("%-25s: %10.2f TL\n", "Ara Toplam", araToplam);
        System.out.printf("%-25s: %10.2f TL\n", "İndirim (" + indirimOrani + "%)", -indirimTutari);
        System.out.printf("%-25s: %10.2f TL\n", "İndirimli Toplam", indirimliToplam);
        System.out.printf("%-25s: %10.2f TL\n", "KDV (%18)", kdvTutari);
        System.out.printf("%-25s: %10.2f TL\n", "Kargo", SHIPPING_FEE);
        System.out.println("----------------------------------------");
        System.out.printf("%-25s: %10.2f TL\n", "GENEL TOPLAM", genelToplam);
        System.out.println("========================================");
        System.out.println("    Teşekkür ederiz! İyi günler :)");
        System.out.println("========================================");

        input.close();
    }
}




1. Ürün Fiyat? (TL): 245
1. Ürün Adedi: 2

2. Ürün Fiyat? (TL): 16
2. Ürün Adedi: 9

3. Ürün Fiyat? (TL): 54
3. Ürün Adedi: 6

?ndirim Oran? (%): 18

========================================
              ALI?VER?? F???
========================================
Ürün            Fiyat       Adet     Toplam
----------------------------------------
Ürün 1         245.00          2     490.00
Ürün 2          16.00          9     144.00
Ürün 3          54.00          6     324.00
----------------------------------------
Ara Toplam               :     958.00 TL
?ndirim (18.0%)          :    -172.44 TL
?ndirimli Toplam         :     785.56 TL
KDV (%18)                :     141.40 TL
Kargo                    :      29.99 TL
----------------------------------------
GENEL TOPLAM             :     956.95 TL
========================================
