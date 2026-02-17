import java.util.ArrayList;

public class ModelRaporlama
{
    
    public double ciroHesapla(ArrayList<ModelUrun> p_satilanUrunler)
    {
        double toplamTutar = 0;
        
       
        for(ModelUrun urun : p_satilanUrunler) {
            toplamTutar = toplamTutar + urun.getUrunFiyati();
        }
        
        return toplamTutar;
    }
    
   
    public int satilanUrunSayisi(ArrayList<ModelUrun> p_satilanUrunler)
    {
        return p_satilanUrunler.size(); // Listenin boyutu = Satış sayısı
    }
}