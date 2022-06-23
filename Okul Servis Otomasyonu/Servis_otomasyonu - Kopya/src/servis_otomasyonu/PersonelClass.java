
package servis_otomasyonu;

public class PersonelClass {
    private int PrsnlID;
    private String Ad;
    private String Soyad;
    private String Tel;
    private String Adres;
    private String unvan;
    private String BaslamaTarih;
    private String Maas;
    private String AracPlaka;

    public PersonelClass(int PrsnlID, String Ad, String Soyad, String Tel, String Adres, String unvan, String Maas, String AracPlaka,String BaslamaTarih) {
        this.PrsnlID = PrsnlID;
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.Tel = Tel;
        this.Adres = Adres;
        this.unvan = unvan;
        this.Maas = Maas;
        this.AracPlaka = AracPlaka;
        this.BaslamaTarih=BaslamaTarih;
    }

    public String getBaslamaTarih() {
      return BaslamaTarih;
    }

    public void setBaslamaTarih(String BaslamaTarih) {
        this.BaslamaTarih = BaslamaTarih;
    }

   public int getPrsnlID() {
        return PrsnlID;
    }

    public void setPrsnlID(int PrsnlID) {
        this.PrsnlID = PrsnlID;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String Ad) {
        this.Ad = Ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String Soyad) {
        this.Soyad = Soyad;
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

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public String getMaas() {
        return Maas;
    }

    public void setMaas(String Maas) {
        this.Maas = Maas;
    }

    public String getAracPlaka() {
        return AracPlaka;
    }

    public void setAracPlaka(String AracPlaka) {
        this.AracPlaka = AracPlaka;
    }
   

}
