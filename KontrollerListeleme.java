import java.util.ArrayList;

public class KontrollerListeleme
{
    // ViewListeleme yerine yeni GUI sınıfımızı tanımladık
    private GUIUrunListeleme v_guiListeleme; 
    private ModelListeleme v_modelListeleme;

    public KontrollerListeleme()
    {
        // Yeni GUI nesnesini oluşturuyoruz, böylece pencere açılıyor
        v_guiListeleme = new GUIUrunListeleme();
        v_modelListeleme = new ModelListeleme();
    }

    public void menuyuListele(ArrayList<ModelUrun> p_gelenUrunListesi, String p_tarih)
    {
        // GUI üzerindeki başlığı günceller
        v_guiListeleme.menuBasligiYazdir(p_tarih);
        
        if (p_gelenUrunListesi.size() > 0) {
            for (ModelUrun urun : p_gelenUrunListesi) {
                // Her bir ürünü GUI'deki etikete (JLabel) ekler
                v_guiListeleme.urunBilgisiYazdir(
                    urun.getUrunID(),
                    urun.getUrunAdi(),
                    urun.getUrunFiyati(),
                    urun.getUrunKategori()
                );
            }
        } else {
            // Eğer ürün yoksa GUI üzerinden mesaj kutusu gösterir
            v_guiListeleme.mesajYazdir("Bu tarihte listelenecek ürün bulunamadı.");
        }
    }
}