import java.util.Scanner;

public class createCustomer {
    private String name;
    private String surname;
    private String age;
    private String id;
    private String telNo;
    private int sex;
    private String date;

    public Customer CreateCustomer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.print("\nTarih Giriniz (gün/ay/yıl): ");
        date = scanner.nextLine();
        System.out.println("----------------------------------------");

        System.out.print("\nAdınızı Giriniz: ");
        name = scanner.nextLine();

        System.out.print("\nSoyadınızı Giriniz: ");
        surname = scanner.nextLine();

        System.out.print("\nYaşınızı Giriniz(Sayı veya Yazım olarak Girebilirsiniz): ");
        age = "";
        for (int kT = 4; kT > 0; kT--) {
            age = scanner.nextLine();

            if (age.length() != 2 && kT > 0) {
                System.out.println("\nYAZIM HATASI!, TEKRAR DENEYİNİZ");
                System.out.println((kT - 1) + " DENEME HAKKINIZ KALDI ");
            }
            if (kT == 0 && age.length() != 2) {
                System.out.println("Deneme hakkınız Sona ermiştir. Hatalı bilgi girdiniz");
            }
            if (age.length() == 2) {
                break;
            }
        }

        System.out.print("\nKimlikNo Giriniz: ");
        id = "";
        for (int kT = 4; kT > 0; kT--) {
            id = scanner.nextLine();

            if (id.length() != 11 && kT > 0) {
                System.out.println("KİMLİK NO EKSİK YADA YANLIŞ TUŞLADINIZ! TEKRAR DENEYİNİZ");
                System.out.println((kT - 1) + " DENEME HAKKINIZ KALDI ");
            }
            if (kT == 0 && id.length() != 11) {
                System.out.println("Deneme hakkınız Sona ermiştir. Hatalı bilgi girdiniz");
            }
            if (id.length() == 11) {
                break;
            }
        }

        System.out.print("\nLütfen Başında \"0\" Olmadan Telefon Numaranızı Giriniz: ");
        telNo = "";
        for (int tT = 4; tT > 0; tT--) {
            telNo = scanner.nextLine();

            if (telNo.length() != 10 && tT > 0) {
                System.out.println("TELEFON NUMARANIZI EKSİK YADA YANLIŞ TUŞLADINIZ! TEKRAR DENEYİNİZ");
                System.out.println((tT - 1) + " DENEME HAKKINIZ KALDI ");
                System.out.println("BAŞINDA \"0\" OLMAMASINA DİKKAT EDİNİZ");
            }
            if (tT == 0 && telNo.length() != 11) {
                System.out.println("Deneme hakkınız Sona ermiştir. Hatalı bilgi girdiniz");
		}
if (telNo.length() == 10) {
break;
}
}

    while (true) {
        String temp = " ";

        System.out.print("\nCinsiyetinizi Giriniz (erkek/kadın)(E/K): ");
        temp = scanner.nextLine();

        if (temp.equalsIgnoreCase("Erkek") || temp.equalsIgnoreCase("E")) {
            sex = 1;
            break;
        } else if (temp.equalsIgnoreCase("Kadın") || temp.equalsIgnoreCase("K")) {
            sex = 2;
            break;
        } else {
            System.out.println("HATALI TUŞLAMA YAPTINIZ! TEKRAR DENEYİNİZ");
            System.out.println("Lütfen E ila K Kısaltmaları İle Cevap Vermeye Özen Gösteriniz");
        }
    }
    scanner.close();
    Customer customer = new Customer(name, surname, age, id, telNo, sex, date);
    return customer;
}


}


