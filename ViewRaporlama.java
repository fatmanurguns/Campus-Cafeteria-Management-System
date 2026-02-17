public class ViewRaporlama
{
    //toplam para(ciro) hesabu yapar, toplam satılan ürün sayısını söyler,satılan ürünleri listeler
    public void raporBasligiYazdir()
    {
       
        System.out.println("GÜN SONU KASA RAPORU   ");
    
        System.out.println("ID \t Ürün Adı \t\t Fiyat"); 
        System.out.println("------------------------");
    }

   
    public void satirYazdir(int p_id, String p_ad, float p_fiyat)
    {
        
        System.out.println(p_id + " \t " + p_ad + " \t" + p_fiyat + " TL");
    }

   
    public void sonucYazdir(int p_toplamAdet, double p_toplamKazanc)
    {
        
        System.out.println("TOPLAM SATILAN ÜRÜN : " + p_toplamAdet + " adet");
        System.out.println("TOPLAM KAZANÇ       : " + p_toplamKazanc + " TL");
        
    }
}


