package Finalproje;

import java.util.Scanner;

public class Hsaha {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Adınızı girin: ");
        String name = sc.nextLine();

        System.out.println(name + " , hoş geldin! ne yapmak istiyorsun?");
        System.out.println("1: Halı saha rezervasyonu\t2: Halı saha bilgisi");
        System.out.print("Giriş: ");
        int secim = sc.nextInt();

        switch (secim)
        {
            case 1:
                Halisaha halisaha = new Halisaha();

                System.out.println("--- Halı Saha Rezervasyonu ---");

                System.out.print("Halı saha için kaç kişi olucaksınız: ");
                halisaha.oyuncusayisi = sc.nextInt();
                System.out.println(halisaha.oyuncusayisi + " kişi olarak işleme devam ediyoruz...");
                sc.nextLine();

                System.out.print("Halı saha da servis olsun mu?: ");
                halisaha.servis = sc.nextLine();

                System.out.print("Rezervasyon için saat girin: ");
                halisaha.saatler = sc.nextInt();

                if (halisaha.saatler < 18)
                {
                    double fiyat = 800 / halisaha.oyuncusayisi;
                    System.out.println(name + " bey girdiğiniz saat için rezervasyon yaptınız.\nFiyat: 800\nOyuncu başına fiyat: " + fiyat);
                    System.out.println(halisaha.saatler + ":00 saatinde rezervasyon yapıldı.");

                }
                else
                {
                    {
                        double fiyat = 1600 / halisaha.oyuncusayisi;
                        System.out.println(name + " bey girdiğiniz saat için rezervasyon yaptınız.\nFiyat: 1600\nOyuncu başına fiyat: " + fiyat);
                        System.out.println(halisaha.saatler + ":00 saatinde rezervasyon yapıldı.");

                    }

                }
                break;
            case 2:
                System.out.println("--- Halı Saha ---");
                System.out.println("Müsait saatler: 12:00-02:00");
                System.out.println("Maksimum oyuncu kapasitesi: 16");
                System.out.println("Servis durumu: Aktif");
                System.out.println("Ücret: 12:00 - 18:00 800TL  |  18:00 - 02:00 1600 TL");
                break;
            default:
                System.out.println("Geçersiz veri girdğiniz için sistem kapatılıyor...");
                break;
        }
    }
}
