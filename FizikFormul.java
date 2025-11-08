/*
 * Ad Soyad: [Shuja Ahmad Tariq]
 * Ogrenci No: [240541608]
 * Tarih: [09-11-2025]
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;

import java.util.Scanner;

public class FizikHesaplayici {
   
    // sabit tanimla
    final static double GRAVITY = 9.8;

    // Hiz
    public static double hesaplaHiz(double yol, double zaman) {
        return yol/zaman;
    }

    // Ivme
    public static double hesaplaIvme(double deltaV, double zaman) {
        return deltaV/zaman;
    }

    // kuvvet
    public static double hesplaKuvvet(double kutle, double ivme) {
        return kutle * ivme;
    }

    // is
    public static double hesaplaIs(double kuvvet, double yol) {
        return kuvvet * yol;
    }

    // guc
    public static double hesplaGuc(double is, double zaman) {
        return is/zaman;
    }

    // kinetik enerji
    public static double hesaplaKinetikEnerji(double kutle, double Hiz) {
        return 0.5 * kutle * Math.pow(Hiz, 2); 
    }

    // Potansiyal Enerji
    public static double hespalaPotansiyalEnerji(double kutle, double GRAVITY, double yukseklik) {
        return kutle * GRAVITY * yukseklik;
    }

    // momentum
    public static double hesaplaMomentum(double kutle, double hiz) {
        return kutle * hiz;
    }

    // ana metot
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n=====================================");
        System.out.println("           Hesaplama Sonuclari");
        System.out.println("=====================================");


        //hiz
        System.out.print("\nYol (metre): ");
        double yol = input.nextDouble();
        System.out.print("Zaman (saniye): ");
        double saniye = input.nextDouble();
        System.out.println("hiz (v): " +hesaplaHiz(yol, saniye) + "m/s");

        //ivme
        System.out.print("\ndeltaV: ");
        double deltaV = input.nextDouble();
        System.out.print("zaman: ");
        double zaman = input.nextDouble();
        System.out.println("Ivme (a): " +hesaplaIvme(deltaV, zaman) + "m/s2");

        //kuvvet
        System.out.print("\nkutle: ");
        double kutle = input.nextDouble();
        System.out.print("ivme: ");
        double ivme = input.nextDouble();
        System.out.println("kuvvet (n): " +hesplaKuvvet(kutle, ivme) + "N");

        //is
        System.out.print("\nkuvvet: ");
        double kuvvet = input.nextDouble();
        System.out.print("yol: ");
        double yolis = input.nextDouble();
        System.out.println("Is (J): " +hesaplaIs(kuvvet, yol) + "J");

        //guc
        System.out.print("\nIs: ");
        double is = input.nextDouble();
        System.out.print("zaman: ");
        double zamanis = input.nextDouble();
        System.out.println("Guc: " +hesplaGuc(is, zamanis) + "W");

        //kinetik enerji
        System.out.print("\nkutle: ");
        double kutleKE = input.nextDouble();
        System.out.print("hiz: ");
        double hiz = input.nextDouble();
        System.out.println("Kinetik Enerji: " +hesaplaKinetikEnerji(kutleKE, hiz) + "J");

        //potansiyal enerji
        System.out.print("\nkutle: ");
        double kutlePE = input.nextDouble();
        System.out.print("Yukseklik: ");
        double Yukseklik = input.nextDouble();
        System.out.println("Potansiyal Enerji: " +hespalaPotansiyalEnerji(kutleKE, kutlePE, Yukseklik) + "J");

        //Momentum
        System.out.print("\nkutle: ");
        double kutleMomentum = input.nextDouble();
        System.out.print("hiz: ");
        double hizMomentum = input.nextDouble();
        System.out.println("Momentum: " +hesaplaMomentum(kutleMomentum, hizMomentum) + "kg*m/s2");

        System.out.println("\n=====================================================");

        input.close();
    }

}



=====================================
           Hesaplama Sonuclari
=====================================

Yol (metre): 2
Zaman (saniye): 4
hiz (v): 0.5m/s

deltaV: 12
zaman: 5
Ivme (a): 2.4m/s2

kutle: 2
ivme: 8
kuvvet (n): 16.0N

kuvvet: 4
yol: 8
Is (J): 8.0J

Is: 5
zaman: 12
Guc: 0.4166666666666667W

kutle: 11
hiz: 17
Kinetik Enerji: 1589.5J

kutle: 5
Yukseklik: 7
Potansiyal Enerji: 385.0J

kutle: 43
hiz: 7
Momentum: 301.0kg*m/s2

=====================================================
PS D:\JAVA\Week 5\FizikFormul> 
