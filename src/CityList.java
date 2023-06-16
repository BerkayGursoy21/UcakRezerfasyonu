
public class CityList {
    public String[] getCityList(int selectCountry) {
        // Şehirler
        String[] turkiyeSehirler = { "İstanbul", "Ankara", "Antalya", "İzmir", "Balıkesir" };
        String[] almanyaSehirler = { "Berlin", "Dusseldorf ", "Frankfurt", "Stuttgart", "Köln" };
        String[] fransaSehirler = { "Paris", "Nice", "Lyon", "Cannes", "Strazburg" };
        String[] ingiltereSehirler = { "Glasglow", "Blackpool", "Liverpool", "Londra", "Newcastle" };
        String[] italyaSehirler = { "Bari", "Bologna", "Pisa", "Milano ", "Roma" };

        if (selectCountry == 1) {
            return turkiyeSehirler;
        }
        if (selectCountry == 2) {
            return almanyaSehirler;
        }
        if (selectCountry == 3) {
            return fransaSehirler;
        }
        if (selectCountry == 4) {
            return ingiltereSehirler;
        }
        if (selectCountry == 5) {
            return italyaSehirler;
        }

        return new String[0];
    }
}
