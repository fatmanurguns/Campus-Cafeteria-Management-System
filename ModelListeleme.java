public class ModelListeleme
{
   
    private String v_sorguTarihi;
    private String v_kategori;

    public ModelListeleme()
    {
        
    }

    public ModelListeleme(String p_sorguTarihi, String p_kategori)
    {
        v_sorguTarihi = p_sorguTarihi;
        v_kategori = p_kategori;
    }

    public String getSorguTarihi()
    {
        return v_sorguTarihi;
    }

    public void setSorguTarihi(String p_sorguTarihi)
    {
        v_sorguTarihi = p_sorguTarihi;
    }
    
    public String getKategori()
    {
        return v_kategori;
    }
    
    public void setKategori(String p_kategori)
    {
        v_kategori = p_kategori;
    }
}