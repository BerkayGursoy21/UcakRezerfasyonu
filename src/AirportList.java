public class AirportList {
    public String[] getAirPortList(int selectedCountry, int selectedCity) {
        
    	String[] istanbulhavalimani = {"İstanbul Havalimanı", "Sabiha Gökçen Havalimanı"};
        String[] ankarahavalimani = {"Ankara Esenboğa Havalimanı"};
        String[] antalyahavalimani = {"Antalya Havalimanı"};
        String[] izmirhavalimani = {"Adnan Menderes Havalimanı"};
        String[] balikesirhavalimani = {"Balıkesir Koca Seyit Havalimanı"};
        String[] berlinhavalimani = {"Berlin Brandenburg Havalimanı1", "Berlin Tempelhof Havalimanı"};
        String[] dusseldorfhavalimani = {"Düsseldorf Uluslararası Havalimanı"};
        String[] frankfurthavalimani = {"Frankfurt Havalimanı"};
        String[] stuttgarthavalimani = {"Stuttgart Havaalanı"};
        String[] kolnhavalimani = {"Köln Bonn Havalimanı"};
        String[] parishavalimani = {"Paris Orly, Paris Charles de Gaulle", "Paris Beauvais"};
        String[] nicehavalimani = {"Cote D'azur Uluslararası Havalimanı"};
        String[] lyonhavalimani = {"Lyon–Saint-Exupéry Havaalanı"};
        String[] canneshavalimani = {"Cannes Mandelieu Airport"};
        String[] strazburghavalimani = {"Strazburg Havalimanı"};
        String[] glasglowhavalimani = {"Glasgow Havaalanı"};
        String[] blackpoolhavalimani = {"Blackpool Airport"};
        String[] liverpoolhavalimani = {"Liverpool Havalimanı"};
        String[] londrahavalimani = {"Londra City", "Londra Heathrow", "Londra Gatwick", "Londra Luton", "Londra Stansted", "Londra Southend"};
        String[] newcastlehavalimani = {"Newcastle Havaalanı"};
        String[] barihavalimani = {"Bari Karol Wojtyła Havaalanı"};
        String[] bolognahavalimani = {"Bologna Guglielmo Marconi Havalimanı"};
        String[] pisahavalimani = {"Pisa Uluslararası Havaalanı"};
        String[] milanohavalimani = {"Milano-Malpensa Havalimanı", "Milano-Bergamo Havalimanı", "Milanı-Malpensa Havaliman"};
        String[] romahavalimani = {"Roma Leonardo da Vinci", "Fiumicino Havalimanı", "Roma Ciampino Havaalanı"};
    
        	public String getHavalimani(int selectedCountry, int selectedCity) {
            	if (selectedCountry == 1) {
                if (selectedCity == 1)
                    return "istanbulhavalimani";
                if (selectedCity == 2)
                    return "ankarahavalimani";
                if (selectedCity == 3)
                    return "antalyahavalimani";
                if (selectedCity == 4)
                    return "izmirhavalimani";
                if (selectedCity == 5)
                    return "balikesirhavalimani";
            }
            if (selectedCountry == 2) {
                if (selectedCity == 1)
                    return "berlinhavalimani";
                if (selectedCity == 2)
                    return "dusseldorfhavalimani";
                if (selectedCity == 3)
                    return "frankfurthavalimani";
                if (selectedCity == 4)
                    return "stuttgarthavalimani";
                if (selectedCity == 5)
                    return "kolnhavalimani";
            }
            if (selectedCountry == 3) {
                if (selectedCity == 1)
                    return "parishavalimani";
                if (selectedCity == 2)
                    return "nicehavalimani";
                if (selectedCity == 3)
                    return "lyonhavalimani";
                if (selectedCity == 4)
                    return "canneshavalimani";
                if (selectedCity == 5)
                    return "strazburghavalimani";
            }
            if (selectedCountry == 4) {
                if (selectedCity == 1)
                    return "glasglowhavalimani";
                if (selectedCity == 2)
                    return "blackpoolhavalimani";
                if (selectedCity == 3)
                    return "liverpoolhavalimani";
                if (selectedCity == 4)
                    return "londrahavalimani";
                if (selectedCity == 5)
                    return "newcastlehavalimani";
            }
            if (selectedCountry == 5) {
                if (selectedCity == 1)
                    return "barihavalimani";
                if (selectedCity == 2)
                    return "bolognahavalimani";
                if (selectedCity == 3)
                    return "pisahavalimani";
                if (selectedCity == 4)
                    return "milanohavalimani";
                if (selectedCity == 5)
                    return "romahavalimani";
               
            }
            
        }
    }
