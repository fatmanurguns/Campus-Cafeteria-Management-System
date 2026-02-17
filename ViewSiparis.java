
public class ViewSiparis
{
  public void siparisBilgisiYazdir(int p_siparisID, int p_musteriID, int p_toplamTutar, String p_odemeDurumu, String p_siparisTarihi)
    {
        System.out.println("Siparis ID: " + p_siparisID);
        System.out.println("Musteri ID: " + p_musteriID);
        System.out.println("Toplam Tutar: " + p_toplamTutar + " TL");
        System.out.println("Odeme Durumu: " + p_odemeDurumu);
        System.out.println("Siparis Tarihi: " + p_siparisTarihi);
    }
}