import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Berkay Havayolu - Rezervasyon Sistemi");
                System.out.println("-----------Berkay Havayolu Rezervasyon Sistemimize Hoşgeldiniz.-----------\n");

                System.out.println("Kalkis Noktasi Seciniz:");
                String kalkisNoktasi = scanner.nextLine();

                System.out.println("Varış Noktası Seçiniz:");
                String ucusNoktasi = scanner.nextLine();

                System.out.println("Müşteri İsim:");
                String isim = scanner.nextLine();

                System.out.println("Müşteri Soyisim:");
                String soyisim = scanner.nextLine();

                System.out.println("Uçuş Tarihi:");
                String tarih = scanner.nextLine();

                System.out.println("Prescription: " + isim + " " + soyisim + " " + ucusNoktasi + " " + tarih + " " + kalkisNoktasi);

                System.out.println("\n-----------Bizi Tercih Ettiğiniz İçin Teşekkür Eder İyi Günler Dileriz.-----------");
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("\nHATALI GİRİŞ YAPTINIZ!");
               
            }

            System.out.println("\n-----------TEKRAR DENEMEK İÇİN \"T\" PROGRAMI BİTİRMEK İÇİN İSE HERHANGİ BİR TUŞA BASINIZ-----------");
            System.out.print("\n: ");
            String isT = scanner.nextLine();
            if (!isT.equalsIgnoreCase("t")) {
                break;
            }
        }

        scanner.close(); 
    }
}
