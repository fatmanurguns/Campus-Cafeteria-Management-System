public class ViewUrun
{
    public void urunBilgisiYazdir(int p_urunID, String p_urunAdi, float p_urunFiyati, String p_urunKategori, int p_stokMiktari)
    {
        System.out.println("Ürün ID: " + p_urunID);
        System.out.println("Ürün Adı: " + p_urunAdi);
        System.out.println("Fiyat   : " + p_urunFiyati + " TL");
        System.out.println("Kategori: " + p_urunKategori);
        System.out.println("Stok    : " + p_stokMiktari);
    }
}
