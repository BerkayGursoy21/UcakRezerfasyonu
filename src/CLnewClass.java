import java.util.ArrayList;
import java.util.List;

public abstract class CLnewClass implements Location {
    private String TLokasyon = "";

    // Listeler
    private List<String> LokasyonListU = new ArrayList<>();
    

    // Ülke seçenekleri
    private String[] ulkeler = { "Türkiye", "Almanya", "Fransa", "İngiltere", "İtalya" };
	public Object lokasyonListH;

    public CLnewClass() {
        for (int i = 0; i < ulkeler.length; i++) {
            TLokasyon = ulkeler[i];
            LokasyonListU.add(TLokasyon);
        }
    }
}
