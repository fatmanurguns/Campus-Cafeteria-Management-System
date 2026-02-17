
public class ModelSiparis
{
   private int v_siparisID;
   private String v_siparisTarihi;
   private int v_musteriID;
   private int v_toplamTutar;
   private String v_odemeDurumu;
   
   public ModelSiparis()
   {
    
   }
   
   public ModelSiparis(int p_siparisID,String p_siparisTarihi ,int p_musteriID ,int p_toplamTutar ,String p_odemeDurumu)
    {
        v_siparisID = p_siparisID;
        v_siparisTarihi = p_siparisTarihi;
        v_musteriID = p_musteriID;
        v_toplamTutar = p_toplamTutar;
        v_odemeDurumu = p_odemeDurumu;
    }
    
   public int getSiparisID()
   {
   return v_siparisID; 
   }
   
   public void setSiparisID(int p_siparisID)
   {
   v_siparisID = p_siparisID; 
   }
   
   public String getSiparisTarihi() 
   {
   return v_siparisTarihi;
   }
   
   public void setSiparisTarihi(String p_siparisTarihi) 
   {
   v_siparisTarihi = p_siparisTarihi;
   }
   
   public int getMusteriID()
   { 
   return v_musteriID;
   }
   
   public void setMusteriID(int p_musteriID)
   { 
   v_musteriID = p_musteriID;
   }
   
   public int getToplamTutar() 
   { 
       return v_toplamTutar; 
   }
   
   public void setToplamTutar(int p_toplamTutar) 
   { 
       v_toplamTutar = p_toplamTutar; 
   }
   
   public String getOdemeDurumu() 
   { 
   return v_odemeDurumu;
   }
   
   public void setOdemeDurumu(String p_odemeDurumu) 
   { 
   v_odemeDurumu=p_odemeDurumu;
   }
}