
import java.util.Scanner;

public class createFlight {

    public String airplane;
    public String location;
    public String date;

    private String tempLocU = "";
    private String tempLocS = "";
    private String tempLocH = "";

    public void CreateFlight(String tip) {
        CreateAirplane ucakOlusturma = new createAirPlane();
        airplane = ucakOlusturma.model;

        CLNewClass cl = new CLNewClass();

        int uSayac = 1;
        for (String item : cl.lokasyonListU) {
            System.out.println(uSayac + "." + item);
            uSayac++;
        }

        int secimU = 0;
        while (true) {
            System.out.print("\n" + tip + " için Ulke seçiniz: ");
            Scanner scanner = new Scanner(System.in);
            secimU = scanner.nextInt();
            System.out.println();

            if (secimU >= 1 && secimU <= uSayac - 1) {
                tempLocU = cl.lokasyonListU.get(secimU - 1);
                break;
            }
        }

        int sSayac = 1;
        CityList cityList = new CityList();
        String[] sehirler = cityList.getCityList(secimU);

        for (String item : sehirler) {
            String tLokasyon = item;
            cl.lokasyonListS.add(tLokasyon);
        }

        for (String item : cl.lokasyonListS) {
            System.out.println(sSayac + "." + item);
            sSayac++;
        }

        int secimS = 0;
        while (true) {
            System.out.print("\n" + tip + " için Sehir seçiniz: ");
            Scanner scanner = new Scanner(System.in);
            secimS = scanner.nextInt();
            System.out.println();

            if (secimS >= 1 && secimS <= sSayac - 1) {
                tempLocS = cl.lokasyonListS.get(secimS - 1);
                break;
            }
        }

        AirportList airportList = new AirportList();
        String[] airports = airportList.getAirPortList(secimU, secimS);

        for (String item : airports) {
            String tLokasyon = item;
            cl.lokasyonListH.add(tLokasyon);
        }

        int hSayac = 1;
        for (String item : cl.lokasyonListH) {
            System.out.println(hSayac + "." + item);
            hSayac++;
        }

        while (true) {
            System.out.print("\n" + tip + " için Havaalanı seçiniz: ");
            Scanner scanner = new Scanner(System.in);
            int secimH = scanner.nextInt();
            System.out.println();

            if (secimH >= 1 && secimH <= hSayac - 1) {
                tempLocH = cl.lokasyonListH.get(secimH - 1);
                break;
            }
        }

        location = tempLocU + " - " + tempLocS + " - " + tempLocH;
    }
}
