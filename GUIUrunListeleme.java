import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIUrunListeleme 
{
    private JFrame pencere;
    private JPanel p_Panel;
    private JLabel l_Baslik, l_UrunBilgisi;
    private JButton b_Kapat;
    private OlayDinleyicisi olayDinleyici;

    public GUIUrunListeleme() 
    {
        olayDinleyici = new OlayDinleyicisi();
        pencereHazirla(pencere);
        panelHazirla(pencere);
        pencere.setVisible(true);
    }

    private void pencereHazirla(JFrame p_Pencere) 
    {
        pencere = new JFrame("Ürün Listeleme Ekranı");
        pencere.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pencere.setSize(500, 400);
    }

    public void panelHazirla(JFrame p_Pencere) 
    {
        p_Panel = new JPanel();
        // Hocanın kullandığı gibi FlowLayout varsayılan olarak gelir
        
        l_Baslik = new JLabel("--- KAFETERYA MENÜSÜ ---");
        l_Baslik.setPreferredSize(new Dimension(450, 30));
        
        // Ürünlerin görüneceği yer
        l_UrunBilgisi = new JLabel("Ürünler yükleniyor...");
        l_UrunBilgisi.setPreferredSize(new Dimension(450, 200));

        b_Kapat = new JButton("KAPAT");
        b_Kapat.addActionListener(olayDinleyici);

        p_Panel.add(l_Baslik);
        p_Panel.add(l_UrunBilgisi);
        p_Panel.add(b_Kapat);

        p_Pencere.add(p_Panel);
    }

    // Hocanın menuBasligiYazdir metodunun GUI hali
    public void menuBasligiYazdir(String p_tarih) 
    {
        l_Baslik.setText("KAFETERYA MENÜSÜ - " + p_tarih);
    }

    // Hocanın urunBilgisiYazdir metodunun GUI hali
    // HTML kullanarak alt alta yazdırıyoruz (JLabel'da alt satıra geçmek için en temiz yol)
    public void urunBilgisiYazdir(int p_id, String p_ad, float p_fiyat, String p_kategori) 
    {
        String eskiYazi = l_UrunBilgisi.getText().replace("<html>", "").replace("</html>", "");
        if(eskiYazi.equals("Ürünler yükleniyor...")) eskiYazi = "";
        
        String yeniSatir = p_id + " - " + p_ad + " (" + p_kategori + ") : " + p_fiyat + " TL<br>";
        l_UrunBilgisi.setText("<html>" + eskiYazi + yeniSatir + "</html>");
    }

    // Hocanın mesajYazdir metodunun GUI hali
    public void mesajYazdir(String p_mesaj) 
    {
        JOptionPane.showMessageDialog(pencere, p_mesaj);
    }

    private class OlayDinleyicisi implements ActionListener 
    {
        public void actionPerformed(ActionEvent event) 
        {
            if (event.getSource() == b_Kapat) 
            {
                pencere.dispose(); // Pencereyi kapatır
            }
        }
    }
}