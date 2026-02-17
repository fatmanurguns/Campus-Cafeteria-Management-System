
import java.util.ArrayList;

public class KontrollerSiparis
{
    private ArrayList<ModelSiparis> v_siparisListesi;
    private ViewSiparis v_viewSiparis;

    public KontrollerSiparis()
    {
        v_siparisListesi = new ArrayList<ModelSiparis>();
        v_viewSiparis = new ViewSiparis();
    }

    public void siparisOlustur(int p_siparisID,String p_siparisTarihi,int p_musteriID, int p_toplamTutar, String p_odemeDurumu)
    {
        
        ModelSiparis v_siparisYeni =new ModelSiparis(p_siparisID, p_siparisTarihi, p_musteriID, p_toplamTutar, p_odemeDurumu);

        v_siparisListesi.add(v_siparisYeni);

        v_viewSiparis.siparisBilgisiYazdir(v_siparisYeni.getSiparisID(), v_siparisYeni.getMusteriID(), v_siparisYeni.getToplamTutar(), v_siparisYeni.getOdemeDurumu(), v_siparisYeni.getSiparisTarihi());
    }
}
