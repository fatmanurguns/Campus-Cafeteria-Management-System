import java.util.ArrayList;

public class KontrollerUrun
{
    private ArrayList<ModelUrun> v_urunListesi;
    private ViewUrun v_viewUrun;

    public KontrollerUrun()
    {
        v_urunListesi = new ArrayList<ModelUrun>();
        v_viewUrun = new ViewUrun();
    }

    
    public void urunEkle(int p_urunID, String p_urunAdi, float p_urunFiyati, String p_urunKategori, int p_stokMiktari)
    {
        ModelUrun v_urunYeni = new ModelUrun(p_urunID, p_urunAdi, p_urunFiyati, p_urunKategori, p_stokMiktari);
        
        v_urunListesi.add(v_urunYeni);
        
        v_viewUrun.urunBilgisiYazdir(v_urunYeni.getUrunID(), v_urunYeni.getUrunAdi(), v_urunYeni.getUrunFiyati(), v_urunYeni.getUrunKategori(), v_urunYeni.getStokMiktari());
    }
    
    public void listeyiGoster()
    {
     for (ModelUrun u : v_urunListesi)
        {
            v_viewUrun.urunBilgisiYazdir(
                u.getUrunID(),
                u.getUrunAdi(),
                u.getUrunFiyati(),
                u.getUrunKategori(),
                u.getStokMiktari()
     );   
    }
}
}
