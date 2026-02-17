import java.util.ArrayList;

public class KontrollerRaporlama
{
    private ViewRaporlama v_viewRapor;
    private ModelRaporlama v_modelRapor;

    public KontrollerRaporlama()
    {
        v_viewRapor = new ViewRaporlama();
        v_modelRapor = new ModelRaporlama();
    }

    
    public void raporuOlustur(ArrayList<ModelUrun> p_gelenListe)
    {
       
        v_viewRapor.raporBasligiYazdir();
        
        
        for(ModelUrun urun : p_gelenListe) {
            v_viewRapor.satirYazdir(
                urun.getUrunID(), 
                urun.getUrunAdi(), 
                urun.getUrunFiyati()
            );
        }
        
        
        double toplamPara = v_modelRapor.ciroHesapla(p_gelenListe);
        int toplamAdet = v_modelRapor.satilanUrunSayisi(p_gelenListe);
        
       
        v_viewRapor.sonucYazdir(toplamAdet, toplamPara);
    }
}