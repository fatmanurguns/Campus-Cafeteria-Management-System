

public class ModelUrun
{
    
    private int v_urunID;
    private String v_urunAdi;
    private float v_urunFiyati;
    private String v_urunKategori;
    private int v_stokMiktari;

    public ModelUrun()
    {
      
    }
    
    public ModelUrun(int p_urunID, String p_urunAdi, float p_urunFiyati,
                     String p_urunKategori, int p_stokMiktari) {
        v_urunID = p_urunID;
        v_urunAdi = p_urunAdi;
        v_urunFiyati = p_urunFiyati;
        v_urunKategori = p_urunKategori;
        v_stokMiktari = p_stokMiktari;
    }

    public int getUrunID() {
        return v_urunID;
    }

    public void setUrunID(int p_urunID) {
        v_urunID = p_urunID;
    }

    public String getUrunAdi() {
        return v_urunAdi;
    }

    public void setUrunAdi(String p_urunAdi) {
       v_urunAdi = p_urunAdi;
    }

    public float getUrunFiyati() {
        return v_urunFiyati;
    }

    public void setUrunFiyati(float p_urunFiyati) {
        v_urunFiyati = p_urunFiyati;
    }

    public String getUrunKategori() {
        return v_urunKategori;
    }

    public void setUrunKategori(String p_urunKategori) {
        v_urunKategori = p_urunKategori;
    }

    public int getStokMiktari() {
        return v_stokMiktari;
    }

    public void setStokMiktari(int p_stokMiktari) {
       v_stokMiktari = p_stokMiktari;
    }
    

}
    