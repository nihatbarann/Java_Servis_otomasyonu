
package servis_otomasyonu;

import java.sql.Date;


public class ogrenciClass {
   private int ogrID;
   private String OgrAdi;
   private String ogrSoyadi;
   private String Tel;
   private String Adres;
   private Date Tarih;
   private String Okul;

    public ogrenciClass(int ogrID, String OgrAdi, String ogrSoyadi, String Tel, String Adres,Date Tarih,String Okul) {
        this.ogrID = ogrID;
        this.OgrAdi = OgrAdi;
        this.ogrSoyadi = ogrSoyadi;
        this.Tel = Tel;
        this.Adres = Adres;
               this.Tarih = Tarih; 
               this.Okul = Okul;

    }

    public String getOkul() {
        return Okul;
    }

    public void setOkul(String Okul) {
        this.Okul = Okul;
    }

    public Date getTarih() {
        return Tarih;
    }

    public void setTarih(Date Tarih) {
        this.Tarih = Tarih;
    }


    public int getOgrID() {
        return ogrID;
    }

    public void setOgrID(int ogrID) {
        this.ogrID = ogrID;
    }

    public String getOgrAdi() {
        return OgrAdi;
    }

    public void setOgrAdi(String OgrAdi) {
        this.OgrAdi = OgrAdi;
    }

    public String getOgrSoyadi() {
        return ogrSoyadi;
    }

    public void setOgrSoyadi(String ogrSoyadi) {
        this.ogrSoyadi = ogrSoyadi;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getAdres() {
        return Adres;
    }

    public void setAdres(String Adres) {
        this.Adres = Adres;
    }

   
   
   
}
